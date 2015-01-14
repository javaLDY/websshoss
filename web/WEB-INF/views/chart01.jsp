<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/12/24
  Time: 20:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.json.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/chart1.js"></script>
    <script type="text/javascript">var _path = '${ctx}'</script>
    <script type="text/javascript">
        <%
            String loginname = (String)session.getAttribute("loginame");

        %>
    </script>
</head>

<body>
<div id="box">
<%--alert('${failure}')--%>
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
            <div id="AddressContent">
                <!--begin-->
  <span id="Label_AddressList">
    <div class="bxSty4">
        <table width="100%" cellpadding="0" cellspacing="0" class="addDivTab tabSty01">
            <tbody>
            <tr class="addbgcolor trSty01">
                <td class="reusableColor5 xxSty01" align="left" height="30">&nbsp;&nbsp;&nbsp;&nbsp;<strong>地址簿 </strong>（您以前用过的地址）</td>
            </tr>
            <tr>
                <td align="left" valign="top" height="145">
                    <div class="changeAdd" align="center" id="changeAdd">
                        <c:forEach items="${memberaddlist}" var="meradd">
                    <span style="font-size: 12px;float: left;width: 950px;margin-left: -86;" id="uniquespanid${meradd.id}" class="uniquespanid">
                         <input type="radio" style="width: 15px;height: 15px;float: left;margin: 3px -38px 0 19px;" id="newaddressid${meradd.id}" name="newaddressid" recman = "${meradd.recman}" address="${meradd.recaddress}" postcode="${meradd.postcode}" tel="${meradd.tel}"/>
                        <label style="color: cornflowerblue">收货人:</label>${meradd.recman}| <label style="color: cornflowerblue">收货地址:</label>${meradd.recaddress}| <label style="color: cornflowerblue">邮政编码:</label>${meradd.postcode}|<label style="color: cornflowerblue">固定电话:${meradd.tel}</label> <label style="color: cornflowerblue">移动电话:</label>${meradd.tel}
                            <span class="addDeleteSty addFontCol" style="float: right;padding: 0px 0px 21px 0px"><a href="#"><span id="addFontCol" class="addFontCol" onclick="updateclick(${meradd.id},'${meradd.recman}','${meradd.recaddress}','${meradd.postcode}','${meradd.tel}')">修改</span></a><span class="addFontCol">　|</span>　<a href="#"><span class="addFontCol" id="deleteFontCol${meradd.id}" onclick="deletemeradd(${meradd.id})">删除</span></a></span><span class="addSpanSty"></span>
                    </span></br></br></br>
                        </c:forEach>

                    </div>
                    <a href="${ctx}/shinowit/chart02"><img src="<%=request.getContextPath()%>/images/button_pszADd.gif" onclick="meradd()" style="margin-left: 409px;margin-bottom: -18px;cursor: pointer"/></a>
                    <%--<a href="chart02.html" style="margin : 0 0 14px 0"><img src="<%=request.getContextPath()%>/images/button_pszADd.gif" border="0" onclick="#" /></a>--%>
                    <div id="edit">
                        <div class="bxSty1">
                            <table class="tabSty01" border="0" cellpadding="0" cellspacing="0" width="100%">
                                <tbody>
                                <tr class="trSty01" bgcolor="#7a7f89">
                                    <td class="reusableColor5 xxSty01" align="left" height="30">&nbsp;&nbsp;&nbsp;&nbsp;请输入新的 <strong>配送地址</strong></td>
                                </tr>
                                <tr>
                                    <td align="center" valign="top">
                                        <form:form action="${ctx}/shinowit/chart01" modelAttribute="merxadd" method="post">
                                            <ul class="psAdd" align="left">
                                                <li>
                                                    <p class="pSty01" align="right">收货人姓名：</p>
                                                    <p class="pSty02 reusableColor3" align="left">
                                                        <form:input path="recman" id="Name" ></form:input>
                                                        &nbsp;&nbsp;<span class="reusableColor4">*</span>&nbsp;&nbsp;
                                                        请准确填写真实姓名，以便确保商品准确无误送达。</p>
                                                </li>
                                                <li class="conLi1"><span class="errorstring" id="errorName" style="color: red"></span></li>
                                                <li>
                                                    <p class="pSty01" align="right">配送省份/直辖市：</p>
                                                    <p>
                                                        <select id="provinceID" name="provinceID" >
                                                            <option selected="selected" value="">--请选择--</option>
                                                        </select>
                                                        &nbsp;&nbsp;市：
                                                        <select id="CityID" name="CityID"  >
                                                            <option selected="selected" value="" >--请选择--</option>
                                                        </select>
                                                        &nbsp;&nbsp;县/区：
                                                        <select id="AreaID" name="AreaID" >
                                                            <option selected="selected" value="">--请选择--</option>
                                                        </select>
                                                        &nbsp;&nbsp;<span class="reusableColor4">*</span>&nbsp;&nbsp; </p>
                                                </li>
                                                <li class="conLi2"><span id="errorArea"></span></li>
                                                <li>
                                                    <p class="pSty01" align="right">详细地址：</p>
                                                    <p class="pSty02">
                                                        <form:textarea path="recaddress" id="Address"   maxlength="500"></form:textarea>
                                                        &nbsp;&nbsp;<span class="reusableColor4">*</span>&nbsp;&nbsp; <br />
                                                        <span class="fontSty reusableColor3">862城市送货上门，货到付款。&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <span class="reusableColor1"><a href="#" target="_blank"> 查看详细的配送范围 </a></span></span> </p>
                                                </li>
                                                <li class="conLi3"><span id="errorAddress" class="errorstring" style="color: red"></span></li>
                                                <li>
                                                    <p class="pSty01" align="right">邮政编码：</p>
                                                    <p class="pSty02 reusableColor3">
                                                        <form:input path="postcode" id="Zip"></form:input>
                                                        &nbsp;&nbsp;<span class="reusableColor4">*</span>&nbsp;&nbsp; <span id="SetPostalCode"></span> </p>
                                                </li>
                                                <li class="conLi4"><span id="errorPostal" class="errorstring" style="color: red"></span></li>
                                                <li>
                                                    <p class="pSty01" align="right">固定电话：</p>
                                                    <p class="pSty02">
                                                        <input name="Tel" id="Tel" onchange="ChecktheForm_Tel()" size="12" type="text" />
                                                        <span id="PhoneCode"></span> </p>
                                                </li>
                                                <li class="conLi5"><span id="errorPhone" class="errorstring"></span></li>
                                                <li>
                                                    <p class="pSty01" align="right">手机：</p>
                                                    <p class="pSty02 reusableColor3">
                                                        <form:input path="tel" id="Mobile"></form:input>
                                                        手机与固定电话至少有一项必填 </p>
                                                </li>
                                                <li class="conLi6"><span id="errorMobile" style="color: red"></span></li>
                                                <li class="conLi7"><span class="addSpanSty"><button style="background-image: url(/images/baocun.jpg);width: 79px;height: 23px;cursor: pointer"/></span></li>
                                            </ul>
                                        </form:form>
                                    </td>
                                </tr>
                                <tr class="trSty01" bgcolor="#dcdfe5">
                                    <td class="reusableColor3 xxSty01" align="left" height="26">&nbsp;&nbsp;&nbsp;&nbsp;接下来您还需要选择 配送方式、支付方式、送货时间。</td>
                                </tr>
                                </tbody>
                            </table>
                        </div>
                    </div></td>
            </tr>
            </tbody>
        </table>
        <div class="addDivPage" id="all_main_down_bottom">
            <div class="pagebtn"><span class="current">1</span>&nbsp;共1页</div>
        </div>
    </div>
    </span><!--end-->
            </div>
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



<%--<div class="aaa" style="display: none;">--%>

    <%--sdkfjhskdjfkh--%>

<%--</div>--%>

<%--<input type="submit" value="按钮">--%>

<script type="text/javascript">
    <%
        if(request.getAttribute("success")!=null){
            out.println("alert('"+request.getAttribute("success")+"')");
        }
        if(request.getAttribute("failure")!=null){
            out.println("alert('"+request.getAttribute("failure")+"')");
        }
    %>
</script>
</body>
</html>