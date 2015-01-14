$(document).ready(function(){
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

    $("#tiaojian1").click(function(){
        var newpageindex = parseInt(pageindex)+1;
        var newpagesum = parseInt(pagesumnum);
        if(newpageindex>newpagesum){
            alert("已经是最后一页了！");
            return;
        }
        window.location.href = "/shinowit/index?pageindex="+newpageindex+"&merchanname="+$("#unique4").text();
    });

    $("#tiaojian2").click(function(){
        var newpageindex = parseInt(pageindex)-1;
        if(newpageindex==0){
            alert("已经是第一页了！");
            return;
        }
        window.location.href = "/shinowit/index?pageindex="+newpageindex+"&merchanname="+$("#unique4").text();
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
        window.location.href = "/shinowit/index?pageindex="+pageindex+"&merchanname="+$("#unique4").text();
    });

});
