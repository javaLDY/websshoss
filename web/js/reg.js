$(document).ready(function(){
    $("#Email").blur(function(){
       if($("#Email").val()===""){
            $("#span_CheckUsername").text("邮箱不能为空");
           return
       }
       if(($("#Email").val()!=="")&&(!$("#Email").val().match(/^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/))){
           $("#span_CheckUsername").text("邮箱不符合规范");
           return
       }else{
           $("#span_CheckUsername").text("");
           $.ajax({
               type : "post",
               url:_path+"/emailvalid",
               data : {email:$("#Email").val()},
               dataType : "text",
               success : function(msg){
                   $("#span_CheckUsername").text(msg)
               },
               error : function(msg){
                   $("#span_CheckUsername").text(msg)
               }
           })
       }
    });
    $("#PassWord").blur(function(){
        if($("#PassWord").val()===""){
            $("#CheckRePassWord").text("密码不能为空");
            return
        }else{
            if(($("#PassWord").val().length<6)||($("#PassWord").val().length)>16){
                $("#CheckRePassWord").text("密码请设为6-16个数字或者字母");
                return
            }else{
                $("#CheckRePassWord").text("");
            }
        }
    });
    $("#RexPassWord").blur(function(){
        if($("#RexPassWord").val()===""){
            $("#ReCheckRePassWord").text("不能为空");
            return
        }else{
            if($("#RexPassWord").val()!=$("#PassWord").val()){
                $("#ReCheckRePassWord").text("两次输入的密码不一致");
                $("#RexPassWord")[0].focus();
                return
            }else{
                $("#ReCheckRePassWord").text("");
            }
        }
    });
    $("#NewUserName").blur(function(){
        if(($("#NewUserName").val()==="")||($("#NewUserName").val().length<0)){
            $("#CheckNewUserName").text("昵称不能为空");
        }else{
            $("#CheckNewUserName").text("");
        }
    });
    $("#Validate_Code").blur(function(){
        if(($("#Validate_Code").val()==="")||($("#Validate_Code").val().length)<0){
            $("#CheckValidateCode").text("验证码不能为空")

        }else{
                $.ajax({
                    type : "POST",
                    url : _path+"/validate",
                    data : {checkvalue:$("#Validate_Code").val()},
                    dataType:"Text",
                    success : function(msg){
                        $("#CheckValidateCode").text(msg);
                    },
                    error : function(msg){
                        $("#CheckValidateCode").text(msg);
                    }
                })
            $("#CheckValidateCode").text("");
        }
    })
});