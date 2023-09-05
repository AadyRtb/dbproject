<%--
  Created by IntelliJ IDEA.
  User: dong
  Date: 2023/9/4
  Time: 17:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>店主信息</title>
    <style>
        table{
            width: 100%;
            border-collapse: collapse;
        }

        table caption{
            font-size: 2em;
            font-weight: bold;
            margin: 1em 0;
        }

        th,td{
            border: 1px solid #999;
            text-align: center;
            padding: 20px 0;
        }

        table thead tr{
            background-color: #008c8c;
            color: #fff;
        }

        table tbody tr:nth-child(odd){
            background-color: #eee;
        }

        table tbody tr:hover{
            background-color: #ccc;
        }

        table tbody tr td:first-child{
            color: #f40;
        }

        table tfoot tr td{
            text-align: right;
            padding-right: 20px;
        }
    </style>
</head>
<body>
<%--${ostu}<br>--%>
<table border="1" cellspacing="0" align="center" items="${oow}"   var="oow">
    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>电话</td>
        <td>操作</td>
    </tr>
    <tr>
        <td>${oow.oid}</td>
        <td>${oow.oname}</td>
        <td>${oow.ophone}</td>

        <td>
            <a href="/ow/delOwByOid?oid=${oow.oid}">删除</a>
            <a href="/ow/updateByOid?oid=${oow.oid}">修改</a>
        </td>
    </tr>

</table>
</body>
</html>

