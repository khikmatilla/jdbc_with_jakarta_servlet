<%@ page import="com.example.jdbc_with_jacarta_servlet.model.Group" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Groups</title>
</head>
<body>
<h2>Group List</h2>
<table border="1">
  <tr>
    <th>ID</th>
    <th>Name</th>
    <th>Created At</th>
    <th>Student Count</th>
  </tr>
  <%
    List<Group> groups = (List<Group>) request.getAttribute("groups");
    for (Group group : groups) {
  %>
  <tr>
    <td><%= group.getId() %></td>
    <td><%= group.getName() %></td>
    <td><%= group.getCreatedAt() %></td>
    <td><%= group.getStudentCount() %></td>
  </tr>
  <% } %>
</table>
</body>
</html>
