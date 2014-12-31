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
        })
//        ss("#newaddressid").change(function(){
//            var aa = ss(this).is(':checked');
//            if(aa){
//                ss("#uniquespanid").css("background"," #FAB362");
//            }else{
//                ss("#uniquespanid").css("background","#FFFFFF");
//            }
//
//        })
    });