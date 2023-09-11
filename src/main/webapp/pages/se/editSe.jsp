<%--
  Created by IntelliJ IDEA.
  User: dong
  Date: 2023/9/8
  Time: 16:19
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
  <form action="/se/updateSubmit">
    摊位编号：<input type="text" name="sid" value="${se.sid}" readonly> <br>
    商品编号：<input type="text" name="gid" value="${se.oid}" readonly> <br>
    剩余库存：<input type="text" name="stock" value="${se.stock}"> <br>
    价&emsp;&emsp;格：<input type="text" name="price" value="${se.price}"> <br>
    <button type="submit">提交</button>
  </form>
</div>
</body>
</html>
