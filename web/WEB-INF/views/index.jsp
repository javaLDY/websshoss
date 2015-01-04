<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/12/24
  Time: 20:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>启奥</title>
    <link href="<%=request.getContextPath()%>/css/style.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript">var _path = '${ctx}'</script>
    <script type="text/javascript">var pageindex = '${pageIndex}'</script>
    <script type="text/javascript">var pagesumnum = '${pagesumnum}'</script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.9.1.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/index.js"></script>
</head>

<body>
<div id="box">
    <!--top start -->
    <div id="top">
        <a href="${ctx}/shinowit/index"><img src="<%=request.getContextPath()%>/images/logo.gif" alt="Estimation" width="255" height="58" border="0" class="logo" /></a>
        <p class="topDiv"></p>
        <p class="navLeft"></p>
        <ul>
            <li><a href="${ctx}/shinowit/index" class="hover">首页</a></li>
            <li><a href="#">关于我们</a></li>
            <li><a href="#">在线客服</a></li>
            <li class="chart"><a href="${ctx}/shinowit/chart">购物车</a></li>
        </ul>
        <p class="navRight"></p>
        <p class="topDiv"></p>
        <form name="serch" action="#" method="post">
            <input type="text" name="txtbox" value="购物搜索" class="txtBox" />
            <input type="submit" name="go" value="搜" class="go" />
        </form>
    </div>
    <!--top end -->
    <!--header start -->
    <div id="header">
        <!--nav start -->
        <div class="nav">
            <ul>
                <li class="first"><a href="#">新品上架</a></li>
                <li><a href="#">坚果炒货</a></li>
                <li><a href="#">补血大枣</a></li>
                <li><a href="#">经典肉类</a></li>
                <li><a href="#">进口零食</a></li>
                <li><a href="#">美味糖果</a></li>
                <li><a href="#">天然干果</a></li>
                <li><a href="#">蒙古奶酪</a></li>
                <li><a href="#">台湾牛轧糖</a></li>
                <li><a href="#">蜜饯果脯</a></li>
                <li class="last"><div id="welcome" class="welmsgdiv2"><span>您好，欢迎光临果果香。</span><a href="${ctx}/shinowit/validlogin">登录</a><span class="Lloginfg">&nbsp;</span><a href="${ctx}/insert">注册</a></div>
                </li>
            </ul>
        </div><!--nav end -->
        <div class="spacer"></div>
    </div>
    <!--header end -->
    <!--guide01 start -->
    <div class="guide01">
        <img src="<%=request.getContextPath()%>/images/guide_01.jpg" width="973" height="62" border="0" usemap="#Map" />
        <map name="Map" id="Map">
            <area shape="rect" coords="398,11,493,51" href="#" />
            <area shape="rect" coords="540,12,633,51" href="#" />
            <area shape="rect" coords="684,12,790,53" href="#" />
            <area shape="rect" coords="830,10,953,54" href="#" />
        </map>
    </div><!--guide01 end -->
    <!--guide02 start-->
    <div class="guide02"> <a href="#"><img src="<%=request.getContextPath()%>/images/guide_02.jpg" width="492" height="107" border="0" /></a><a href="#"><img src="<%=request.getContextPath()%>/images/guide_03.jpg" width="481" height="107" border="0" /></a></div>
    <!--guide02 end -->
    <!--recommend start-->
    <div class="recommend">
        <h2>推荐美国山核桃长寿果 大杏仁 15.8/半斤 奶香味</h2>
        <p><img src="<%=request.getContextPath()%>/images/coma.gif" width="15" height="12" style="margin-right:12px;" />山核桃,又名胡桃、马核桃、核桃楸果,是乔木核桃楸的种子。山核桃营养丰富,价值很高,是一种优质木本高级油料作物。此外,还含锌、锰、铬等微量元素与尼克酸等。<img src="<%=request.getContextPath()%>/images/coma_inverse.gif" width="15" height="12" style="margin-left:12px;" /></p>
    </div>
    <!--recommend end-->
    <!--body start -->
    <form:form action="" modelAttribute="merchan">
    <div id="body">
        <!--leftMain start -->
        <div id="leftMain">
            <!--left start -->
            <div id="left">
                <h2>商品分类</h2>
                <%--<form action="${ctx}/shinowit/merchanCinfo" method="get">--%>
                <c:forEach items="${merchanCinfo}" var="merchanC">
                <ul>
                    <li><a class="uniqueid"  href="<%=request.getContextPath()%>/shinowit/index?merchanCid=${merchanC.merchandisecid}"  data="${merchanC.merchandisecid}">${merchanC.merchandisecname}</a></li>
                </ul>
                </c:forEach>
                <%--</form>--%>
                <h2 class="detail">商品信息</h2>
                <div id="uniqueid2">
                <c:forEach items="${merchandise}" var="merchandise">
                <ul class="leftLink">
                    <li><a class="unique3" href="<%=request.getContextPath()%>/shinowit/index?merchanname=${merchandise.merchandisename}">${merchandise.merchandisename}</a></li>
                </ul>
                </c:forEach>
                </div>
                <br class="spacer" />
<span style="color:#f9c441;">ssss<br />
ssssssssss<br />
</span>
            </div>
            <!--left end -->
        </div>
        <!--leftMain end -->
        <!--mid start -->
        <div id="mid">
            <h2>新品上市</h2>
            <!--hotsale_ad start -->
            <div class="hotsale_ad"><img src="<%=request.getContextPath()%>/images/pic1.jpg" width="780" height="274" /></div>
            <!--hotsale_ad end -->
            <!--hotsale start -->
            <div class="hotsale" id="hotsalea">
                <c:forEach items="${merchandiseall}" var="merchandisea">
                <dl>
                    <dt><a href="${ctx}/shinowit/innerpage?merchanname=${merchandisea.merchandisename}" target="_new"><img src=${ctx}/${merchandisea.picpath} width="130" height="130" border="0" /></a></dt>
                    <dd style="color: yellowgreen;text-align: center">|${merchandisea.merchandisename}|￥${merchandisea.price}|</dd>
                    <dd  style="visibility:hidden" id="unique4">${merchanname}</dd>
                    <dd><span class="viv2"><a href="${ctx}/shinowit/innerpage?merchanname=${merchandisea.merchandisename}" target="_new"><img src="<%=request.getContextPath()%>/images/dianjichakan.jpg" width="80" height="24" border="0" style="margin-left: 40px" /></a></span></dd>
                </dl>
                </c:forEach>
                <br class="spacer" />
            </div>
            <!--hotsale end -->
        </div>
        <!--mid end -->
        <br class="spacer" />
        <div class="page" style="text-align: center;border: 1px solid yellowgreen;background:yellowgreen ">
            <img id="tiaojian2" src="<%=request.getContextPath()%>/images/jiantou1.png" style="cursor: pointer"/>&nbsp;共 ${merchandisetoalnum} 个商品 | 分 ${pagesumnum} 页显示 | 当前第 ${pageIndex} 页 | <input type="text" id="inputpageto" style="width: 35px"/>&nbsp;<button id="pageto" style="width: 30px;background: yellowgreen;cursor: pointer" type="button">go</button>&nbsp;<img id="tiaojian1" src="<%=request.getContextPath()%>/images/jiantou2.png" style="cursor: pointer"/>
        </div>
    </div>
    </form:form>
    <!--footer start -->
    <div id="footer">

        <ul>
            <li><a href="#">首页</a>|</li>
            <li><a href="#">关于我们</a>|</li>
            <li><a href="#">新闻资讯</a>|</li>
            <li><a href="#">价单下载</a>|</li>
            <li><a href="#">联系我们</a>|</li>
        </ul>
        <p class="copyright">Copyright 2010 vancl.com All Rights Reserved 冀ICP证xxxxxx号

        </p>
        <p class="design"><a href="http://www.CSSK8.com/" target="_blank" class="link">启奥科技</a></p>
    </div><!--footer end -->
    <!--body end -->
</div><!--box-->
</body>
</html>
