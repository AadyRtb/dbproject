<%--
  Created by IntelliJ IDEA.
  User: dong
  Date: 2023/9/5
  Time: 16:29
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
    <form action="/sta/updateSubmit">
        摊位编号：<input type="text" name="sid" value="${sta.sid}" readonly> <br>
        店主编号：<input type="text" name="oid" value="${sta.oid}"> <br>
        营业状态：<input type="text" name="state" value="${sta.state}"> <br>
        收&emsp;&emsp;入：<input type="text" name="income" value="${sta.income}"> <br>
        <button type="submit">提交</button>
    </form>
</div>
</body>
</html>
