var ss = $.noConflict();
var MerAdd = function(id,recman,address,postcode,tel){
    this.id = id;
    this.postcode = postcode;
    this.recaddress = postcode;
    this.recman = recman;
    this.tel = tel;
}
    ss(document).ready(function(){
        //点击radio变换背景颜色
        ss("[name='newaddressid']").click(function(){
            ss(this).parent().css("background","#FF6100").siblings().css("background","none");
        });
        ss.ajax({//省级获取
            type : "GET",
            url : _path+"/shinowit/provnice",
            success : function(msg){
                ss(msg).each(function () {
                    var opt = ss("<option/>").text(this.name).attr("value", this.id);
                    var input = ss("<input type='hidden'/>").attr("value",this.name);
                    ss("#provinceID").append(opt,input);
                })
            }
        });
        var aa = "";
        var bb = "";
        var cc = "";
        ss("#provinceID").change(function(){
            aa = this.options[this.selectedIndex].innerText;//获取当前选中的省份
            showproince();//调用市级的获取
        });

        ss("#CityID").change(function(){//获取当前选中的市
            bb = this.options[this.selectedIndex].innerText;
            showarea();//调用县区级的获取方法
        });

        ss("#AreaID").change(function(){
            cc = this.options[this.selectedIndex].innerText;//获取当前选中的县区
            ss("#Address").text(aa+bb+cc)//将选中的省，市，县区
        });
//市级获取
        function showproince(){
            ss("#CityID").empty();//当选中省级的时候清空市，区，防止当再次选中省的时候或出现在市级上面出现堆积的现象
            ss("#CityID").append(ss("<option/>").text("请选择"));
            ss("#AreaID").empty();
            ss("#AreaID").append(ss("<option/>").text("请选择"));
            ss.ajax({
                type : "POST",
                url : _path+"/shinowit/city",
                data : {provinceid:ss("#provinceID").val()},
                success : function(msg){
                    ss(msg).each(function () {
                        var opt = ss("<option/>").text(this.name).attr("value", this.id);
                        ss("#CityID").append(opt);
                    })
                }
            });
        }
//区级查询
        function showarea(){
            ss("#AreaID").empty();//同样是防止在选取市级的时候在县区上面出现堆积的现象
            ss("#CityID").append(ss("<option/>").text("请选择"));
            ss("#AreaID").append(ss("<option/>").text("请选择"));
            ss.ajax({
                type : "POST",
                url : _path+"/shinowit/area",
                data : {cityid:ss("#CityID").val()},
                success : function(msg){
                    ss(msg).each(function () {
                        var opt = ss("<option/>").text(this.name).attr("value", this.id);
                        ss("#AreaID").append(opt);
                    })
                }
            });
        }
        //为空和正则判断
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
    });
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
        dataType : "Text",
        success : function(msg){
            alert(msg);
            window.location = _path+"/shinowit/chart01"
        },
        error : function(msg){
            alert(msg)
        }
    })
}
//将选中的地址添加到数据库
function meradd(){
    var meradd = new Array();
    ss("#changeAdd input[type=radio]:checked").each(function(){
        var id = ss(this).id;
        var recman = ss(this).attr("recman");
        var address = ss(this).attr("address");
        var postcode = ss(this).attr("postcode");
        var tel = ss(this).attr("tel");
        var meradddata = new MerAdd(id,recman,address,postcode,tel);
        meradd.push(meradddata);
    });
    var contend = ss.toJSON(meradd);
    ss.ajax({
        type : "POST",
        url : _path+"/shinowit/meraddsession",
        data : {jsonData:contend},
        contendType : "application/json"
    })
};

//session失效跳转