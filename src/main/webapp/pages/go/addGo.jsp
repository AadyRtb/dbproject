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
    <title>添加商品</title>
    <style>
        #add
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
<div id="add">
    <form action="/go/addGo">
        <%--        店铺号：<input type="text" name="sid"> <br>--%>
        商品名称：<input type="text" name="gname"><br>
        商品种类：<input type="text" name="type"><br>
        <button type="submit">添加</button>
    </form>
</div>
</body>
</html>
