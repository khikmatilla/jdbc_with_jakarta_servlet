<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 3/28/2025
  Time: 9:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Book Create</title>
</    <jsp:include page="/fragments/css.jsp"/>

</head>
<body>
<jsp:include page="/fragments/navbar.jsp"/>

<form method="post">
    <div class="mb-3">
        <label for="title" class="form-label">Book Titla</label>
        <input type="email" class="form-control" id="title" name="title"/>
        <div id="text" class="form-text">We'll never share your email with anyone else.</div>
    </div>
    <div class="mb-3">
        <label for="peges" class="form-label">Pages Count</label>
        <input type="number" class="form-control" id="peges" name="peges">

    </div>
    <button type="submit" class="btn btn-success">Save</button>
</form>


<jsp:include page="/fragments/js.jsp"/>
</body>
</html>
