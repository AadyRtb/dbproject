<%--
  Created by IntelliJ IDEA.
  User: dong
  Date: 2023/9/6
  Time: 10:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>修改信息</title>
    <style>
        #change
        {
            margin: 0 auto;
            margin-top: 100px;
            padding: 20px 50px;
            width: 500px;
            height: 400px;
            border-radius: 20px;
            text-align: center;
        }
    </style>
</head>
<body>
<%--准备编辑数据：${stu}<br>--%>
<div id="change">
    <form action="/go/updateSubmit">
        商品编号：<input type="text" name="gid" value="${go.gid}" readonly> <br>
        商品名称：<input type="text" name="gname" value="${go.gname}"> <br>
        商品类型：<input type="text" name="type" value="${go.type}"> <br>
        <button type="submit">提交</button>
    </form>
</div>
</body>
</html>
