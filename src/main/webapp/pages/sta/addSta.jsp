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
    <title>添加摊位</title>
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
    <form action="/sta/addSta">
<%--        店铺号：<input type="text" name="sid"> <br>--%>
    &emsp;&emsp;店主编号：<input type="text" name="oid"> <br>
        营业状态：营业中<input type="radio" name="state" value="营业中">
                休息中<input type="radio" name="state" value="休息中">   <br>
    &emsp;&emsp;收&emsp;&emsp;入：<input type="text" name="income"> <br>
        <button type="submit">添加</button>
    </form>
</div>
</body>
</html>

