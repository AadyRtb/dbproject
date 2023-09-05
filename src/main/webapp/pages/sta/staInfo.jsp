<%--
  Created by IntelliJ IDEA.
  User: dong
  Date: 2023/9/5
  Time: 16:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>店铺信息管理</title>
    <style>
        .select{
            width:500px;
            height:40px;
            border:2px solid red;
            margin:0 auto auto 0;
            float: left;
        }

        .text{
            float:left;
            width:400px;/*宽400*/
            height:38px;/*高38（因为文本框内外边框要占用1像素所以总体高度减2，其他盒子同理）*/
            outline:none;
            border:none;/*取消文本框内外边框*/
        }

        .inputButton{
            float:left;
            width:100px;
            height:40px;
            color:white;
            background-color:deepskyblue;/*将按钮背景设置为红色，字体设置为白*/
            border:none;
            outline:none;/*取消边框和外边框将按钮边框去掉*/
        }

        .exit{
            width:96px;
            height:40px;
            margin:0 0 auto auto;
            float: right;
        }

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
<%--      ${stu_info}<br>--%>
<form action="selectById">
    <div class="select">
        <input href="getStaById?sid=${sta.sid}" class="text" type="text" placeholder="店铺" name="sid" required="required"/>
        <input type="submit" class="inputButton" value="查询" />
    </div>

    <div>
        <input type="button" onclick="window.location.href='/pages/choose.jsp';" class="exit" value="返回选择界面" />
    </div>
</form>

<table>
    <tr>
        <td>店铺编号</td>
        <td>店主编号</td>
        <td>营业状态</td>
        <td>收入</td>
        <td>操作</td>
    </tr>

    <c:forEach items="${sta_info}"   var="sta">
        <tr>
            <td>${sta.sid}</td>
            <td>${sta.oid}</td>
            <td>${sta.state}</td>
            <td>${sta.income}</td>
            <td>
                <a href="/sta/delStaBySid?sid=${sta.sid}">删除</a>
                <a href="/sta/updateBySid?sid=${sta.sid}">修改</a>
            </td>
        </tr>
    </c:forEach>
    <tr>
        <td colspan="5" align="center">
            <a href="/pages/sta/addSta.jsp">添加</a>
        </td>
    </tr>
</table>
</body>
</html>

