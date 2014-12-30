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
//
    $(".checkboxid").click(function(){
        var aa = $(this).is(':checked');
        if(aa){
            $("#spRealTotalAmount").text($(".00072650").attr("data"))
        }else{
            $("#spRealTotalAmount").text("")
        }
    });
//全选框时间
    function selectall(){
        $("input[type=checkbox]").prop("checked","checked");
    }
    function selectnone(){
        $("input[type=checkbox]").removeAttr("checked");
    }
    $("#firstcheckboxid").change(function(){
        var aa = $(this).is(':checked');
        if(aa){
            selectall()
        }else{
            selectnone()
        }
    })
});
