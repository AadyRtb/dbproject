<%--
  Created by IntelliJ IDEA.
  User: dong
  Date: 2023/9/8
  Time: 15:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<html>
<head>
  <title>添加商品供应</title>
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
  <form action="/se/addSe">
    <%--        店铺号：<input type="text" name="sid"> <br>--%>
      商品编号：<input type="text" name="gid"> <br>
    摊位编号：<input type="text" name="sid"> <br>
    库&emsp;&emsp;存：  <input type="text" name="stock"> <br>

    价&emsp;&emsp;格：<input type="text" name="price"> <br>
    <button type="submit">添加</button>
  </form>
</div>
</body>
</html>

