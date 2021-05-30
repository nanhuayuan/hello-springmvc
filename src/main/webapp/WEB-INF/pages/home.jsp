<%--
  Created by IntelliJ IDEA.
  User: 76502
  Date: 2021/5/30
  Time: 17:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主页</title>
</head>
<body>
    <h1>欢迎来到主页</h1>
    ${requestScope.name}<br>
    ${sessionScope.gender} <br>
    ${sessionScope.name} <br>
</body>
</html>
