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
    <form action="/ow/updateSubmit">
        编号：<input type="text" name="oid" value="${ow.oid}" readonly> <br>
        姓名：<input type="text" name="oname" value="${ow.oname}"> <br>
        电话：<input type="text" name="ophone" value="${ow.ophone}"> <br>
        <button type="submit">提交</button>
    </form>
</div>
</body>
</html>