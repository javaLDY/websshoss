var ss = $.noConflict();
ss(document).ready(function(){
    ss("#sessiondelete").click(function(){
        ss.colorbox({
            width : 980,
            height : 550,
            html :
                "<div style='border: none'>"+
                    "<img src="+_path+"'/images/4041.jpg'/>"+
                "</div>"
        });
         ss.ajax({
            type : "POST",
            url : _path+"/shinowit/sessionvalid"
        });
        setTimeout(function(){
             window.location=_path+"/shinowit/chart"
         },3000);

    });
});

