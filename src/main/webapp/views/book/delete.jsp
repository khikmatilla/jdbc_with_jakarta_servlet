<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="jacarta.tags.core" uri="http://java.sun.com/jstl/xml"%>
<html>
<head>
    <title>Book Create</title>
</    <jsp:include page="/fragments/css.jsp"/>

</head>
<body>
<jsp:include page="/fragments/navbar.jsp"/>

<form method="post">

    <div class="alert alert-danger">
        <h1>Are you sure delete this book?<i><c:out value="${book.getTitle()}"/></i></h1>
    </div>
    <button type="submit" class="btn btn-danger">Yes</button>
    <a href="/" class="btn btn-warning">back</a>
</form>


<jsp:include page="/fragments/js.jsp"/>
</body>
</html>
