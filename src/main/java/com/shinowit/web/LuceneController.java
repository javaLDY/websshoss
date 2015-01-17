package com.shinowit.web;

import com.shinowit.dao.mapper.TmeMerchandiseinfoMapper;
import com.shinowit.dao.mapper.ToolsDao;
import com.shinowit.entity.TmeMerchandiseinfo;
import com.shinowit.entity.TmeMerchandiseinfoCriteria;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.StringField;
import org.apache.lucene.document.TextField;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.queryparser.classic.MultiFieldQueryParser;
import org.apache.lucene.queryparser.classic.QueryParser;
import org.apache.lucene.search.*;
import org.apache.lucene.search.highlight.Highlighter;
import org.apache.lucene.search.highlight.QueryScorer;
import org.apache.lucene.search.highlight.SimpleHTMLFormatter;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.NIOFSDirectory;
import org.apache.lucene.util.Version;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.wltea.analyzer.lucene.IKAnalyzer;

import javax.annotation.Resource;
import java.io.*;
import java.math.BigDecimal;
import java.util.*;

/**
 * Created by Administrator on 2015/1/14.
 */
@Controller
@RequestMapping("/test")
public class LuceneController {

    @Resource
    private ToolsDao dao;

    @Resource
    private TmeMerchandiseinfoMapper merdao;



    public String getFileReaderContent(String filePath){
        StringBuffer sb=new StringBuffer();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "gb2312")); // 指定读取文件的编码格式，要和写入的格式一致，以免出现中文乱码,
            String str = null;
            while ((str = reader.readLine()) != null) {
                sb.append(new String(str.getBytes(),"utf-8"));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }

    public  Map<String,Object> query(int pageSize, int pageIndex, String queryString) throws Exception {

        Map<String,Object> resultMap=new HashMap<String,Object>();

        File indexDir = new File("D://luceneIndex1");
        Analyzer analyzer = new IKAnalyzer();
        // 有文件系统或者内存存储方式,这里使用文件系统存储索引数据
        Directory directory = new NIOFSDirectory(indexDir);

        IndexReader indexReader = DirectoryReader.open(directory);

        // 创建搜索类
        IndexSearcher indexSearcher = new IndexSearcher(indexReader);

        QueryParser queryParser = new MultiFieldQueryParser(Version.LUCENE_4_10_3, new String[]{"filename"}, analyzer);
        queryParser.setDefaultOperator(QueryParser.OR_OPERATOR);//多个关键字时采取 or 操作
        Query query = queryParser.parse(queryString + "*");


        int start = (pageIndex - 1) * pageSize;
        int max_result_size = start + pageSize;
        TopScoreDocCollector topDocs = TopScoreDocCollector.create(max_result_size, false);
        indexSearcher.search(query, topDocs);

        int rowCount = topDocs.getTotalHits();  //满足条件的总记录数
        int pages = (rowCount - 1) / pageSize + 1; //计算总页数

        resultMap.put("listsize",rowCount);

        System.out.println("查到的满足查询条件的记录:" + rowCount);

        System.out.println("满足查询条件分页页数:" + pages);

        TopDocs tds = topDocs.topDocs(start, pageSize);
        ScoreDoc[] scoreDoc = tds.scoreDocs;



        // 关键字高亮显示的html标签，需要导入lucene-highlighter-x.x.x.jar
        SimpleHTMLFormatter simpleHTMLFormatter = new SimpleHTMLFormatter("<font color='red'>", "</font>");
        Highlighter highlighter = new Highlighter(simpleHTMLFormatter, new QueryScorer(query));
        List<TmeMerchandiseinfo> indexresult = new ArrayList<TmeMerchandiseinfo>();
        for (int i = 0; i < scoreDoc.length; i++) {
            int doc_id = scoreDoc[i].doc;
            Document mydoc = indexSearcher.doc(doc_id);
            TokenStream tokenStream2 = analyzer.tokenStream("img", new StringReader(mydoc.get("img")));
            String content = highlighter.getBestFragment(tokenStream2, mydoc.get("img"));
            TmeMerchandiseinfo em = new TmeMerchandiseinfo();
            em.setMerchandisename(mydoc.get("filename"));
            em.setPicpath(mydoc.get("img"));
            em.setPrice(new BigDecimal(mydoc.get("price")));
            indexresult.add(em);
            System.out.println("商品名称 ：" + mydoc.get("filename") + " 图片路径:" + mydoc.get("img")+"价格"+mydoc.get("price"));
        }
        resultMap.put("list",indexresult);
        return resultMap;
    }

//    @RequestMapping("/lucene")
//    public String test(){
//        LuceneController ll = new LuceneController();
//        try {
//            TmeMerchandiseinfoCriteria criteria = new TmeMerchandiseinfoCriteria();
//            TmeMerchandiseinfoCriteria.Criteria tj = criteria.createCriteria();
//            tj.andMerchandiseidIsNotNull();
//            List<TmeMerchandiseinfo> merlist = merdao.selectByExample(criteria);
//            ll.createIndex(merlist);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return "success";
//    }

}
