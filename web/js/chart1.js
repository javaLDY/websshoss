var ss = $.noConflict();
    ss(document).ready(function(){
        var cc = ss(".changeAdd").children().children("span > input[type=checkbox]");
        cc.change(function(){
            var aa = ss(cc).is(':checked');
            if(aa){
                ss("#uniquespanid").css("background"," #FAB362");
            }else{
                ss("#uniquespanid").css("background","#FFFFFF");
            }

        });
        ss("#Name").blur(function(){
            if((ss(this).val()==="")){
                ss("#errorName").text("收货人姓名不能为空");
                ss(this).focus();
            }else{
                ss("#errorName").text("");
            }
        });

        ss("#Zip").blur(function(){
            if((ss(this).val()==="")){
                ss("#errorPostal").text("邮政编码不能为空");
                ss(this).focus();
            }else{
                ss("#errorPostal").text("");
            }
        });

        ss("#Address").blur(function(){
            if((ss(this).val()==="")){
                ss("#errorAddress").text("收货地址不能为空");
                ss(this).focus();
            }else{
                ss("#errorAddress").text("");
            }
        });

        ss("#Mobile").blur(function(){
            if((ss(this).val()==="")){
                ss("#errorMobile").text("联系电话不能为空");
                ss(this).focus();
            }else{
                if(!ss(this).val().match(/(\d{11})|^((\d{7,8})|(\d{4}|\d{3})-(\d{7,8})|(\d{4}|\d{3})-(\d{7,8})-(\d{4}|\d{3}|\d{2}|\d{1})|(\d{7,8})-(\d{4}|\d{3}|\d{2}|\d{1}))$/)){
                    ss("#errorMobile").text("联系电话不合法");
                }else{
                    ss("#errorMobile").text("");
                }
            }

        });
        //灯箱操作
//        ss("#addFontCol").click(function(){
////            window.open('aa.htm','','width=600,height=600,top=100,left=100');
////            ss("#addFontCol").focus();
//            ss("#cboxLoadedContent").css("background","#FAB362");
//            ss.colorbox({
//                html :
//                    "<table style='border-collapse:separate; border-spacing:10px;width: 453px;height: 354px' id='table1'>"+
//                    "<tbody>"+
//                    "<tr>"+
//                    "<td style='background: #808080;width: 0;height: 46px'>请输入新的发货地址</td>"+
//                    "</tr>"+
//                    "<tr>"+
//                    "<td style='margin: 0'>"+
//                    "<form id='formid'>"+
//                    "<ul style='border-collapse:separate; border-spacing:10px;margin: 29px 92px 30px 92px' id='newul'>"+
//                    "<li style='margin-left: 15px'>"+
//                    "<label >收货人:</label><input  type='text'/>"+
//                    "</li></br>"+
//                    "<li>"+
//                    "<label >收货地址:</label><textarea/>"+
//                    "</li></br>"+
//                    "<li>"+
//                    "<label >邮政编码:</label><input type='text'/>"+
//                    "</li></br>"+
//                    "<li>"+
//                    "<label >联系电话:</label><input type='text'/>"+
//                    "</li></br>"+
//                    "<li>"+
//                    "<input type='submit' style='margin-left: 105px;width: 95px;background: red'/>"+
//                    "</li>"+
//                    "</ul>"+
//                    "</form>"+
//                    "</td>"+
//                    "</tr>"+
//                    "</tbody>"+
//                    "</table>"
//            })
//        })
});
//问问老师怎么选出修改的还有就是可不可以在这里加上form标签
function updateclick(msg,recname,recaddress,postcode,tel){
    ss.colorbox({
        html :
            "<table style='border-collapse:separate; border-spacing:10px;width: 453px;height: 354px' id='table1'>"+
            "<tbody>"+
            "<tr>"+
            "<td style='background: #808080;width: 0;height: 46px'>请输入新的发货地址</td>"+
            "</tr>"+
            "<tr>"+
            "<td style='margin: 0'>"+
            "<form id='formid' action='/shinowit/update' method='post'>"+
            "<input  type='text' value="+msg+" name='id' style='visibility: hidden'/>"+
            "<ul style='border-collapse:separate; border-spacing:10px;margin: 10px 92px 30px 92px' id='newul'>"+
            "<li style='margin-left: 15px'>"+
            "<label >收货人:</label><input name='recman' value="+recname+" type='text'/>"+
            "</li></br>"+
            "<li>"+
            "<label >收货地址:</label><input name='recaddress' value="+recaddress+" type='text'/>"+
            "</li></br>"+
            "<li>"+
            "<label >邮政编码:</label><input name='postcode' value="+postcode+" type='text'/>"+
            "</li></br>"+
            "<li>"+
            "<label >联系电话:</label><input name='tel' value="+tel+" type='text'/>"+
            "</li></br>"+
            "<li>"+
            "<input type='submit' style='margin-left: 105px;width: 95px;background: red'/>"+
            "</li>"+
            "</ul>"+
            "</form>"+
            "</td>"+
            "</tr>"+
            "</tbody>"+
            "</table>"
    })
}
//删除
function deletemeradd(msg){
    ss.ajax({
        type : "POST",
        url : "/shinowit/deletemeradd",
        data : {id : msg},
        dataType : "Text"
    })
}
