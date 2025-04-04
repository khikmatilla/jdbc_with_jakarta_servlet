<%@ page import="java.util.Arrays" %><%--
  Created by IntelliJ IDEA.
  User: user
  Date: 4/3/2025
  Time: 11:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Main Page</title>
</head>
<body>
<h1>Username: <%=
Arrays.stream(request.getCookies())
        .filter(cookie -> cookie.getName().equals("username"))
        .findFirst()
        .get()
        .getValue()
%></h1>
<h1>Main Page</h1>
</body>
</html>
