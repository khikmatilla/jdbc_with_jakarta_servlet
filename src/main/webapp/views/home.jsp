<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Book List Page</title>
    <jsp:include page="/fragments/css.jsp"/>

</head>
<body>
<jsp:include page="/fragments/navbar.jsp"/>

<div class="container mr-5">
    <div class="row">
        <div class="col-md.10offset-1">
            <table class="table">
                <thead>
                <tr>
                    <th scope="col">Id</th>
                    <th scope="col">Title</th>
                    <th scope="col">Pages Count</th>
                    <th scope="col">Actoins</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${books}" var="book">
                    <tr>
                        <td><c:out value="${book.getId()}"/></td>
                        <td><c:out value="${book.getTitle()}"/></td>
                        <td><c:out value="${book.getPeges()}"/></td>
                        <td>
                            <a href="book/delete/${book.getId()}" class="btn btn-danger">Delate</a> ||
                            <a href="book/update/${book.getId()}" class="btn btn-warning">Update</a>
                        </td>
                    </tr>
                </c:forEach>


                </tbody>
            </table>
        </div>
    </div>
</div>


<jsp:include page="/fragments/js.jsp"/>
</body>
</html>
