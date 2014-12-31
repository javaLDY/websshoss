$(document).ready(function(){
    $("#tiaojian1").click(function(){
        var newpageindex = parseInt(pageindex)+1;
        var newpagesum = parseInt(pagesumnum);
        $("#tiaojian1").css("background","green");
        if(newpageindex>newpagesum){
            alert("已经是最后一页了！");
            return;
        }
        window.location.href = "/shinowit/chart?pageindex="+newpageindex+"&merchanname="+$("#unique4").text();
    });

    $("#tiaojian2").click(function(){
        var newpageindex = parseInt(pageindex)-1;

        if(newpageindex==0){
            alert("已经是第一页了！");
            return;
        }
        window.location.href = "/shinowit/chart?pageindex="+newpageindex+"&merchanname="+$("#unique4").text();
    });
//分页的变换样式
    $("#tiaojian1").mousedown(function(){
        $("#tiaojian1").css("background","green");
    });
    $("#tiaojian1").mouseup(function(){
        $("#tiaojian1").css("background","yellowgreen");
    });
    $("#tiaojian2").mousedown(function(){
        $("#tiaojian2").css("background","green");
    });
    $("#tiaojian2").mouseup(function(){
        $("#tiaojian2").css("background","yellowgreen");
    });
    $("#pageto").click(function(){
        var pageindex = $("#inputpageto").val();
        var newpagesum = parseInt(pagesumnum);
        if(pageindex<1){
            alert("输入值不合法！");
            return;
        }
        if(pageindex>newpagesum){
            alert("输入值超出了总的也数！");
            return;
        }
        window.location.href = "/shinowit/chart?pageindex="+pageindex+"&merchanname="+$("#unique4").text();
    });


//全选框事件
    function selectall(){
        $("input[type=checkbox]").prop("checked","checked");
//        $('#shoppingCatTable input[type=checkbox]:checked').each(function(i,n){
//            n = parseFloat($(this).attr('money'));
//                alert("Item #" + i + ": " + n);
//        });
    }
    function selectnone(){
        $("input[type=checkbox]").removeAttr("checked");
    }
    $("#firstcheckboxid").change(function(){
        var aa = $(this).is(':checked');
        if(aa){
            selectall();
            var total_money=0;
            $('#uniquetrid input[type=checkbox]').each(function(){
                total_money=total_money+parseFloat($(this).attr('money'));
            });
        }else{
            selectnone();
            $("#spRealTotalAmount").text("0.00");
        }
        $("#spRealTotalAmount").text(total_money);
    })
//多条删除
$("#jl02").click(function(){
    var totalidarry =new Array();
    var totalid = 0;
//    var checked = $('#shoppingCatTable input[type=checkbox]:checked');
//    for(var a = 0;a<checked.length;a++){
//        totalidarry += $(checked).attr('newid');
//        if(a!=checked.length-1){
//            totalidarry +=","
//        }
//    }
//    }
    $('#shoppingCatTable input[type=checkbox]:checked').each(function(i){
//        n = parseFloat($(this).attr('newid'));
//        totalid=[i,n];
        var ee = $('#shoppingCatTable input[type=checkbox]:checked').length;
        totalid = parseFloat($(this).attr('newid'));
        totalidarry += "list["+i+"]:"+totalid;
        if(i!=ee-1){
            totalidarry +=",";
        }
//        var aa = parseFloat($(this).attr('newid'));
//        totalidarry.push(aa);
        m = {p:totalidarry};
    });
//    var content = JSON.parse(totalidarry);
//    var content = $.toJSON(totalidarry);
//    $.each(content, function () {
//        alert(this.list);
//    });

//    var postdata = new Array();
//    postdata[0] = { id: 1, number: "yes" };
//    postdata[1] = { id: 2, number: "no" };
    var content = $.toJSON(m);
//    $.each(content, function () {
//        alert(this.m);
//    });

   // var v = totalidarry.toString();
//    var bb = totalidarry.toJSON;
//    var cc = JSON.stringify(totalidarry);
//    var dd = totalidarry.serializeArray();
    $.ajax({
        type : "get",
        url : _path+"/shinowit/deleteall",
        data : {arrayid : m},
        dataType : "JSON",
        success : function(){

        },
        error : function(){

        }
    })
})
});
//当点击checkbox的时候改变金额
function singlecheck(id){
    var total_money=0;
     $('#shoppingCatTable input[type=checkbox]:checked').each(function(){
         total_money=total_money+parseFloat($(this).attr('money'));
     });
    $("#spRealTotalAmount").text(total_money);
}
//点击减数量
function mousedown(id){
    $("#OrderAmount_2"+id).val(parseInt($("#OrderAmount_2"+id).val())-1);
    $("#jianid"+id).css("background","gray");
    $("#jianid"+id).mouseup(function(){
        $("#jianid"+id).css("background","lightgrey")
    })
    if(parseInt($("#OrderAmount_2").val())<1){
        parseInt($("#OrderAmount_2").val(1))
    }
}
//点击加数量
function mousedown1(id){
    $("#OrderAmount_2"+id).val(parseInt($("#OrderAmount_2"+id).val())+1);
    $("#numaddid"+id).css("background","gray");
    $("#numaddid"+id).mouseup(function(){
        $("#numaddid"+id).css("background","lightgrey")
    })
}
function inputblur(id){
    if(parseInt($("#OrderAmount_2"+id).val())<1){
        parseInt($("#OrderAmount_2"+id).val(1))
    }
}