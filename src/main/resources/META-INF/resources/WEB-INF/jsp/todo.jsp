<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Todo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
          rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
          crossorigin="anonymous">
</head>
<body>
<div class="container">
    <h1>Enter Todo Details ${name}</h1>
    <%--<form:form method="post" modelAttribute="todo">
        <label for="description" id="description">Description</label>
        <form:input type="text" name="description" required="required" path="description"/>
        <form:errors path="description" cssClass="text-warning"/>
        <form:input type="hidden" path="id"/>
        <form:input type="hidden" path="done"/>
        <input type="submit" class="btn btn-success"/>
    </form:form>--%>
    <form:form method="post" modelAttribute="todo">
        <label for="description" id="description">Description</label>
        <form:input type="text" name="description" required="required" path="description"/>
        <form:errors path="description" cssClass="text-warning"/>
        <form:input type="hidden" path="id"/>
        <form:input type="hidden" path="done"/>
        <input type="submit" class="btn btn-success"/>
    </form:form>

</div>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
        crossorigin="anonymous"></script>
</body>
</html>