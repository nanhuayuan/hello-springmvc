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
    <title>跳转页面</title>
</head>
<body>
    <h1>欢迎来到跳转页面</h1>
    <fmt:formatDate value="${sessionScope.user.birth}" pattern="yyyy-MM-dd"/> <br/>
    ${sessionScope.user.birth} <br>
    ${requestScope.age}
</body>
</html>
