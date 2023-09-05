<%--
  Created by IntelliJ IDEA.
  User: dong
  Date: 2023/9/5
  Time: 19:21
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
    <form action="/us/updateSubmit">
        编&emsp;号：<input type="text" name="uid" value="${us.uid}" readonly> <br>
        账号名：<input type="text" name="username" value="${us.username}"> <br>
        电&emsp;话：<input type="text" name="phone" value="${us.phone}"> <br>
        <button type="submit">提交</button>
    </form>
</div>
</body>
</html>
