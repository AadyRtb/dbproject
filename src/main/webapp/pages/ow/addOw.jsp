<%--
  Created by IntelliJ IDEA.
  User: dong
  Date: 2023/9/4
  Time: 19:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>添加店主</title>
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
    <form action="/ow/addOw">
<%--        编号：<input type="text" name="oid"> <br>--%>
        姓名：<input type="text" name="oname"> <br>
        电话：<input type="text" name="ophone"> <br>
        <button type="submit">添加</button>
    </form>
</div>
</body>
</html>

