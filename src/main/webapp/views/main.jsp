<%--
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
<h1>Username: <%=request.getSession().getAttribute("uername")%></h1>
<h1>Main Page</h1>
</body>
</html>
