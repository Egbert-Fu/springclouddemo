<%--
  Created by IntelliJ IDEA.
  User: Egbert
  Date: 2018/4/21
  Time: 18:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SpringCloud-DEMO</title>
</head>
<body>
<h2>输入您要查询的省份编号</h2>
<input type="text" id="provinceID" />
<input type="button" value="查询" onclick="getProvince()"/>
<div id="table" style="margin-top: 20px">

</div>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
    function getProvince() {
        var provinceID = $("#provinceID").val();
        if (provinceID == null){
            alert("请输入省份编号");
            return;
        }
        $.post("http://127.0.0.1/getProvince",
            {
                provinceID:provinceID
            },function (data) {
                var province = JSON.parse(data).message;
                var table = "<table border='2'><tr><th>省份编号</th><th>省份名称</th><th>城市编号</th><th>城市名称</th></tr>";
                for(var i=0;i<province.citys.length;i++){
                    var city = province.citys[i];
                    table += "<tr><td>"+province.provinceID+"</td><td>"+province.provinceName+"</td><td>"+city.cityId+"</td><td>"+city.cityName+"</td></tr>";
                }
                table += "</table>";
                $("#table").html(table);
            }
        );
    }
</script>
</body>
</html>
