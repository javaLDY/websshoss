<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/12/24
  Time: 20:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>无标题文档</title>
    <link href="<%=request.getContextPath()%>/css/style.css" rel="stylesheet" type="text/css" />
    <link href="<%=request.getContextPath()%>/css/LoginAndReg.css" rel="stylesheet" type="text/css" />
    <link href="<%=request.getContextPath()%>/css/gmxx.css" rel="stylesheet" type="text/css" />
    <link href="<%=request.getContextPath()%>/css/colorbox.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.9.1.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.colorbox.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/chart2.js"></script>
    <script type="text/javascript">var _path = '${ctx}'</script>
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
            <li class="last">
                <div id="welcome" class="welmsgdiv2"><span>您好，欢迎光临果果香。</span><a href="${ctx}/shinowit/login">登录</a><span class="Lloginfg">&nbsp;</span><a href="${ctx}/reg">注册</a></div>
            </li>
        </ul>
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
    <!--body start -->
    <div id="body">
        <div id="Login">
            <DIV id="gwc">
                <div id="step_" align="left">结算步骤: <span class="" id="shoppingstep_0">1.登录注册</span> &gt;&gt; <span class="shoppingstepcontrol" id="shoppingstep_2">2.填写核对订单信息</span> &gt;&gt; <span class="" id="shoppingstep_3">3.提交订单</span></div>
                <div id="onEdit"></div>
                <DIV class="title"><SPAN id="transferSpan"></SPAN></DIV>
                <DIV id="divPointError" style="DISPLAY: none; FLOAT: left; MARGIN: 0px 0px 10px">
                    <DIV class="pointErrorMsg">您目前的积分为：<SPAN id="myPointNumber">0</SPAN>分，本次购物需支付：<SPAN
                            id="needPointNumber">0</SPAN>分，请修改购物车中的积分换购产品。</DIV><IMG id="imgPointError"
                                                                                     src="<%=request.getContextPath()%>/images/jifenbuzhu.gif" useMap=#Map border=0> <MAP id="Map"
                                                                                                                                            name=Map><AREA shape=RECT coords=962,9,972,19
                                                                                                                                                           href="javascript:ClosePointError();"></MAP></DIV>
                <DIV id=OffProductList></DIV>
                <TABLE cellSpacing=0 cellPadding=0 width=100% border=0>
                    <TBODY>
                    <TR>
                        <TD vAlign=center align=left><SPAN
                                id="TenPayNotice"></SPAN></TD></TR></TBODY></TABLE>
                <table class="tabSty01" border="0" cellpadding="0" cellspacing="0" width="100%">
                    <tbody>
                    <tr>
                        <td><div class="titleSty">
                            <h2 align="left">商品信息<span class="reusableColor4 typeH2"><a href="#"><span class="addFontCol"></span></a></span></h2>
                            <c:forEach items="${src}" var="chart">
                            <span id="Label_Addressee">
        <h4 align="left">
            <img src="${ctx}/${chart.picth}" style="width: 110px;height: 110px;float:right;margin-top: -7px"/><br />
            <span class="reusableColor3">名称：</span>${chart.merchandisename}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br />
            <span class="reusableColor3">数量：</span>${chart.num}<br />
            <span class="reusableColor3">金额：</span>${chart.price}</h4>

      </span></br>
                            </c:forEach></div></td>
                    </tr>
                    </tbody>
                    <form method="post" name="Myform" id="Myform">
                    </form>
                    <tr class="trSty01" bgcolor="#7a7f89">
                        <td class="reusableColor5 xxSty01 typeBottom" align="left" valign="middle">&nbsp;&nbsp;&nbsp;&nbsp;请选择 <strong>配送方式　</strong> <span id="Lb1newChange"></span></td>
                    </tr>
                    <tr>
                        <td><div class="titleSty"> <span id="Label_Addressee">
        <h2 align="left">收货人信息<span class="reusableColor4 typeH2"><a href="#"><span class="addFontCol"></span></a></span></h2>
        <h4 align="left"><span class="reusableColor3 letterSpac">收货人</span><span class="reusableColor3 letterSpac1">：
        <c:forEach items="${meraddsrc}" var="meradd">
        </span>${meradd.recman}<br />
            <span class="reusableColor3">地　　区：</span>${meradd.recaddress}&nbsp;&nbsp;-&nbsp;&nbsp;&nbsp;&nbsp;-&nbsp;&nbsp;<br />
            <span class="reusableColor3">收货地址：</span>${meradd.recaddress}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br />
            <span class="reusableColor3">邮政编码：</span>${meradd.postcode}<br />
            <span class="reusableColor3">联系方式：</span>${meradd.tel}</h4>
            </c:forEach>
      </span> </div></td>
                    </tr>
                    <tr>
                        <td class="typeTd2"><span class="addDeleteSty addFontCol"><a href="#"><span class="addFontCol">修改</span></a><span class="addFontCol">　|</span>　<a href="#"><span class="addFontCol" id="sessiondelete" >删除</span></a></span><span class="addSpanSty"><a href="${ctx}/shinowit/chart03"><img src="<%=request.getContextPath()%>/images/button_qr.gif" border="0" onclick="#" /></a></span><br />
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                    </tr>
                </table>
<SPAN
        id="leavelNotMustPresentLsit"></SPAN>
                <DIV class="sty006 reusableColor3" align=left>您在购物过程中有任何疑问，请查阅 <A
                        href="#" target=_blank><SPAN
                        class="reusableColor1">帮助中心</SPAN></A> 或 <A href="#"
                                                                    target=_blank><SPAN class="reusableColor1">联系客服</SPAN></A></DIV>
                <DL class="dobuleBorder" style="display:none;">
                    <DT><STRONG>关于"我的购物车"</STRONG> </DT>
                    <DD>·为方便您提交订单，您添加至"我的购物车"中已经选择的、尚未提交订单的商品清单，我们将为您保留90天。<BR>·在商品保留期间，您所选择商品的价格、优惠政策、库存、配送时间等信息可能会有所变化，请以网页最新信息为准。
                    </DD></DL></DIV>
        </div>
        <br class="spacer" />
    </div>
    <!--footer start -->
    <div id="footer">
        <ul>
            <li><a href="#">首页</a>|</li>
            <li><a href="#">关于我们</a>|</li>
            <li><a href="#">新闻资讯</a>|</li>
            <li><a href="#">价单下载</a>|</li>
            <li><a href="#">联系我们</a>|</li>
        </ul>
        <p class="copyright">Copyright 2010 All Rights Reserved 冀ICP证xxxxxx号

        </p>
        <p class="design"><a href="#" target="_blank" class="link">启奥科技</a></p>
    </div><!--footer end -->
    <!--body end -->
</div><!--box-->
</body>
</html>

