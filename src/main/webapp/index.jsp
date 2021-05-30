<%--
  Created by IntelliJ IDEA.
  User: 76502
  Date: 2021/5/24
  Time: 21:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>hello world</h1>
    <fmt:formatDate value="${sessionScope.user.birth}" pattern="yyyy-MM-dd"/> <br/>
    ${sessionScope.user.birth} <br>
    ${sessionScope.user.id} <br>
    ${requestScope.age}<br>
    ${requestScope.name}<br>
</body>
</html>
