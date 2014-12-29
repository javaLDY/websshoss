$(document).ready(function(){
    $("#tiaojian1").click(function(){
        var newpageindex = parseInt(pageindex)+1;
        var newpagesum = parseInt(pagesumnum);
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

    $("input[type='checkbox']").click(function(){
//        if($(this).attr("checked")==true){
//            $("#spRealTotalAmount").text($("#00072650").attr("data"))
//            return;
//        }
//        if($(this).attr("checked")==false){
//            $("#spRealTotalAmount").text("")
//        }
        var aa = $(this).is(':checked');
        if(aa){
            $("#spRealTotalAmount").text($("#00072650").attr("data"))
        }else{
            $("#spRealTotalAmount").text("")
        }
    })
});
