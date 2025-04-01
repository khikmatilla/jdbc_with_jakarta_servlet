
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Book Update</title>
</    <jsp:include page="/fragments/css.jsp"/>

</head>
<body>
<jsp:include page="/fragments/navbar.jsp"/>

<form method="post">
    ${book.toString()}
    <div class="mb-3">
        <label for="title" class="form-label">Book Titla</label>
        <input type="email" class="form-control" id="title" name="title" value="${book.getTitlr()}"/>
        <div id="text" class="form-text">We'll never share your email with anyone else.</div>
    </div>
    <div class="mb-3">
        <label for="peges" class="form-label">Pages Count</label>
        <input type="number" class="form-control" id="peges" name="peges" value="${book.getPeges()}">

    </div>
    <button type="submit" class="btn btn-success">Save</button>
</form>


<jsp:include page="/fragments/js.jsp"/>
</body>
</html>
