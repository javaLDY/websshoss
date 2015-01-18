package com.shinowit.web.tools;

import com.shinowit.dao.mapper.TmeMerchandiseinfoMapper;
import com.shinowit.entity.TmeMerchandiseinfo;
import com.shinowit.entity.TmeMerchandiseinfoCriteria;
import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.StringField;
import org.apache.lucene.document.TextField;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.index.Term;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.NIOFSDirectory;
import org.apache.lucene.util.Version;
import org.springframework.scheduling.annotation.Scheduled;
import org.wltea.analyzer.lucene.IKAnalyzer;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * Created by LDY on 2015/1/16.
 */

public class AutoTask {

    @Resource
    private TmeMerchandiseinfoMapper merdao;

    public void createIndex( List<TmeMerchandiseinfo> merlist) throws Exception {
        File indexDir = new File("D://luceneIndex1");
        //File dataDir = new File(merlist.toString());
        Analyzer analyzer = new IKAnalyzer();
        //File[] dataFiles = dataDir.listFiles();

        // 有文件系统或者内存存储方式,这里使用文件系统存储索引数据
        Directory directory = new NIOFSDirectory(indexDir);

        // 生成全文索引的配置对象
        IndexWriterConfig indexWriterConfig = new IndexWriterConfig(Version.LUCENE_4_10_3, analyzer);

        // 设置生成全文索引的方式为创建或者追加
        indexWriterConfig.setOpenMode(IndexWriterConfig.OpenMode.CREATE_OR_APPEND);

        // 创建真正生成全文索引的writer对象
        IndexWriter indexWriter = new IndexWriter(directory, indexWriterConfig);

        long startTime = new Date().getTime();

        for (TmeMerchandiseinfo ss : merlist) {
            Document document = new Document();
            StringField field_filename = new StringField("filename", ss.getMerchandisename(), Field.Store.YES);
            document.add(field_filename);

            TextField txt_content_img = new TextField("img", ss.getPicpath(), Field.Store.YES);

            document.add(txt_content_img);

            TextField txt_content_price = new TextField("price", ss.getPrice().toString(), Field.Store.YES);

            document.add(txt_content_price);

            indexWriter.addDocument(document);
        }
        indexWriter.commit();
        indexWriter.close();
        long endTime = new Date().getTime();

        System.out.println("It takes " + (endTime - startTime)
                        + " milliseconds to create index for the files in directory "
        );
    }

    public void deleteindex(){
        File indexDir = new File("D://luceneIndex1");
        Directory directory = null;
        Analyzer analyzer = new IKAnalyzer();
        try {
            directory = new NIOFSDirectory(indexDir);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 生成全文索引的配置对象?
        IndexWriterConfig indexWriterConfig = new IndexWriterConfig(Version.LUCENE_4_10_3, analyzer);

        // 设置生成全文索引的方式为创建或者追加?
        indexWriterConfig.setOpenMode(IndexWriterConfig.OpenMode.CREATE_OR_APPEND);

        // 创建真正生成全文索引的writer对象
        try {
            IndexWriter indexWriter = new IndexWriter(directory, indexWriterConfig);
            indexWriter.deleteDocuments(new Term(indexDir.getPath()));
            indexWriter.deleteAll();
            indexWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //@Scheduled(cron="0 2 0 ? * *")
    public void autotaskcd() throws Exception {
        AutoTask auto = new AutoTask();
        auto.deleteindex();
        TmeMerchandiseinfoCriteria criteria = new TmeMerchandiseinfoCriteria();
        TmeMerchandiseinfoCriteria.Criteria tj = criteria.createCriteria();
        tj.andMerchandiseidIsNotNull();
        List<TmeMerchandiseinfo> merlist = merdao.selectByExample(criteria);
        auto.createIndex(merlist);
    }

//    @Scheduled(cron = "0 22 17 ? * *")
//    public void loginsrror(){
//        CacheManager manager = CacheManager.getInstance();
//        Cache cache = manager.getCache("user_try_login_cache");
//        cache.removeAll();
//    }

}
