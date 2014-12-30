<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/12/24
  Time: 20:34
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
    <script type="text/javascript">var pageindex = '${pageindex}'</script>
    <script type="text/javascript">var pagesumnum = '${sumnum}'</script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.9.1.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/chart.js"></script>
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
                <DIV class="mcar" style="width:774px; margin:auto"><IMG alt=我的购物车
                                                                        src="<%=request.getContextPath()%>/images/pic_gwc__r2_c2.jpg"></DIV>
                <DIV class="title"><SPAN id="transferSpan"></SPAN></DIV>
                <DIV id="divPointError" style="DISPLAY: none; FLOAT: left; MARGIN: 0px 0px 10px">
                    <DIV class="pointErrorMsg">您目前的积分为：<SPAN id="myPointNumber">0</SPAN>分，本次购物需支付：<SPAN
                            id="needPointNumber">0</SPAN>分，请修改购物车中的积分换购产品。</DIV><IMG id="imgPointError"
                                                                                     src="<%=request.getContextPath()%>/images/jifenbuzhu.gif" useMap=#Map border=0> <MAP id="Map"
                                                                                                                                            name=Map><AREA shape=RECT coords=962,9,972,19
                                                                                                                                                           href="javascript:ClosePointError();"></MAP></DIV>
                <DIV class="bxSty"><!--Product-->
                    <table width="80%" border="0" align="center" cellpadding="0" cellspacing="0" class="tabSty01" id="shoppingCatTable">
                        <tr class="trSty01" bgcolor="#7a7f89">
                            <td align="center" height="32"><input type="checkbox"  style="height: 20px;width: 20px" id="firstcheckboxid" class="checkboxid" />勾选</td>
                            <td align="center" height="32">商品</td>
                            <td align="center" height="32">名称</td>
                            <td align="center" height="32">单价</td>
                            <td align="center" height="32">数量</td>
                            <td align="center" height="32">小计</td>
                            <td align="center">操作</td>
                        </tr>
                        <c:forEach items="${modellist}" var="chart">
                        <tr>
                            <td align="center"><input type="checkbox"  style="height: 20px;width: 20px" id="checkboxid" class="checkboxid" /></td>
                            <td width="160" height="170" align="center" valign="middle"><span class="imgw"><a href="#" target="_blank"><img src="${ctx}/${chart.picth}" alt="带帽水洗收腰休闲夹克 灰色" border="0" width="160" height="170" /></a></span></td>
                            <td><a href="#" target="_blank"><span class="STYLE5">${chart.merchandisename}</span></a></td>
                            <td align="center">￥<span id="00072650" class="00072650" data="${chart.price}">${chart.price}</span></td>
                            <td align="center"><input name="OrderAmount_2" id="OrderAmount_2" maxlength="3" onchange="changeSuccess=false;EditProductCount('00072650','1',this)" onkeypress=" if((arguments[0] || window.event).keyCode==13){this.blur(); return false;}" style="width: 20px; height: 15px; color: rgb(75, 75, 75);" value="${chart.num}" type="text" /></td>
                            <td align="center">￥<span id="Pdt_price">${chart.smallsum}</span></td>
                            <td align="center"><a href="javascript:DeleteProduct('00072650',1);">删除</a></td>
                        </tr>
                        </c:forEach>
                    </table>
                    <TABLE width="80%" border=0 align="center" cellPadding=0 cellSpacing=0 class="dobuleBorder">
                        <TBODY>
                        <TR>
                            <TD class="tdStyProductTotal" vAlign=top align=right>产品数量总计：<SPAN
                                    class="colSty " id="spTotalCount">${sumnum}</SPAN><SPAN
                                    class="colSty sty008">件</SPAN>赠送积分总计：<SPAN class="colSty"
                                                                               id="giftPoint">0</SPAN><SPAN class="colSty sty008">分</SPAN>花费积分总计：<SPAN
                                    class="colSty " id="totalPoint">0</SPAN><SPAN
                                    class="colSty sty010">分</SPAN>&nbsp;&nbsp;<SPAN id="decspan">产品金额总计：<SPAN
                                    class="colSty ">￥${totalprice}</SPAN>
                               <BR><SPAN class="fontSty01">实际金额：<SPAN
                                    class="colSty"><STRONG>￥</STRONG></SPAN><STRONG><SPAN class="colSty"
                                                                                          id="spRealTotalAmount">0.00</SPAN></STRONG></SPAN></SPAN></TD></TR></TBODY></TABLE>
                    <TABLE width="80%" border=0 align="center" cellPadding=0 cellSpacing=0 class="tabSty001">
                        <TBODY>
                        <TR>
                            <TD class="tdSty03" vAlign=top align=left colSpan=2><A
                                    href="#"><IMG
                                    src="<%=request.getContextPath()%>/images/pic_gwc__r10_c3.jpg" alt=继续购物 width=95 height=25 border="0"></A><A
                                    href="#">&nbsp;<IMG
                                    src="<%=request.getContextPath()%>/images/pic_gwc__r10_c8.jpg" alt=清空购物车 width=95 height=25 border="0" class="jl02"></A></TD>
                            <TD align=left>&nbsp;</TD>
                            <TD align=middle>&nbsp;</TD>
                            <TD class="tdSty04" vAlign=top align=right colSpan=3><A
                                    href="${ctx}/shinowit/chart01"><IMG
                                    src="<%=request.getContextPath()%>/images/pic_gwc__r2_c10.jpg" alt=去结算 border="0"></A></TD></TR></TBODY></TABLE><!--Product end--></DIV>
                <DIV id=OffProductList></DIV>
                <TABLE cellSpacing=0 cellPadding=0 width=760 border=0>
                    <TBODY>
                    <TR>
                        <TD vAlign=center align=left><SPAN
                                id="TenPayNotice"></SPAN></TD></TR></TBODY></TABLE><SPAN
                    id="leavelNotMustPresentLsit"></SPAN>
                <DIV class="sty006 reusableColor3" align=left style="width:774px; padding:0; margin:auto">您在购物过程中有任何疑问，请查阅 <A
                        href="#" target=_blank><SPAN
                        class="reusableColor1">帮助中心</SPAN></A> 或 <A href="#"
                                                                    target=_blank><SPAN class="reusableColor1">联系客服</SPAN></A></DIV>
                <DL class="dobuleBorder" style="display:none;">
                    <DT><STRONG>关于"我的购物车"</STRONG> </DT>
                    <DD>·为方便您提交订单，您添加至"我的购物车"中已经选择的、尚未提交订单的商品清单，我们将为您保留90天。<BR>·在商品保留期间，您所选择商品的价格、优惠政策、库存、配送时间等信息可能会有所变化，请以网页最新信息为准。
                    </DD></DL></DIV>
        </div>
        <br class="spacer" />
        <div class="page" style="text-align: center;border: 1px solid yellowgreen;background:yellowgreen ">
            <img id="tiaojian2" src="<%=request.getContextPath()%>/images/jiantou1.png" style="cursor: pointer"/>&nbsp;共 ${sumnum} 个商品 | 分 ${pagetotalnum} 页显示 | 当前第 ${pageindex} 页 | <input type="text" id="inputpageto" style="width: 35px"/>&nbsp;<button id="pageto" style="width: 30px;background: yellowgreen" type="button">go</button>&nbsp;<img id="tiaojian1" src="<%=request.getContextPath()%>/images/jiantou2.png" style="cursor: pointer"/>
        </div>
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
