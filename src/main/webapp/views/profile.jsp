<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 4/3/2025
  Time: 11:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Profile Page</title>
</head>
<body>

<h1>Username: <%=request.getSession().getAttribute("username")%></h1>
<h1>Profile Page</h1>

</body>
</html>
