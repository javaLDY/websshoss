<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2015/1/1
  Time: 16:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.9.1.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.colorbox.js"></script>
    <%--<link href="<%=request.getContextPath()%>/css/colorbox.css" rel="stylesheet" type="text/css" media="screen" />--%>
    <style>
        ul li{list-style: none}
        #newul li input{height: 30px}
        table{border: 1px solid #808080; margin:0px auto;visibility: hidden}
    </style>
    <script type="text/javascript">
        $(document).ready(function(){
            $("#button1").click(function(){
                $.colorbox({
                    height : 500,
                    width : 500,
                    inline : true,
                    href : "table1"
                })
            });
        })
    </script>
</head>
<body>
    <table style="border-collapse:separate; border-spacing:10px" id="table1">
        <tbody>
            <tr>
                <td>请输入新的发货地址</td>
            </tr>
            <tr>
                <td>
                    <form id="formid">
                    <ul style="border-collapse:separate; border-spacing:10px" id="newul">
                        <li style="margin-left: 15px">
                            <label>收货人:</label><input  type="text"/>
                        </li></br>
                        <li>
                            <label>相信地址:</label><input type="text"/>
                        </li></br>
                        <li>
                            <label>邮政编码:</label><input type="text"/>
                        </li></br>
                        <li>
                            <label>联系电话:</label><input type="text"/>
                        </li></br>
                        <li>
                            <input type="submit"/>
                        </li>
                    </ul>
                    </form>
                </td>
            </tr>
        </tbody>
    </table>
    <div style='display: none'>
        <div id='inline_comment' style='padding: 10px; background: #fff'>
            <ul class="comment-box">
                <a name="ques-btn"></a>
                <li>
                    <p>
                        <strong> 您的评论：</strong></p>
                    <textarea id="commentBody" class="comment-input" name="content" cols="" rows=""></textarea></li>
                <li><a href="javascript:submitComment();" style="width: 108px; margin-top: 8px; height: 26px;
                display: block; border: none; cursor: pointer;">
                    <img src="/Content/images/button/btn-forum-comment.jpg" alt="" /></a> </li>
            </ul>
            <br />
        </div>
    </div>
    <button id="button1">点击</button>
</body>
</html>
