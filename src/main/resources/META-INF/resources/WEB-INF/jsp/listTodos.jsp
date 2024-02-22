<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>


<div class="container">
    <div>
        <h1> Again Welcome to in28minutes</h1>
        <h2>your Todos are ${name}:</h2>
        <h3>
            <table class="table">
                <tr>
                    <th>Description</th>
                    <th>Target Date</th>
                    <th>Is Done?</th>
                    <th></th>
                    <th></th>
                </tr>
                <tbody>
                <c:forEach items="${todos}" var="todo">
                    <tr>
                        <td>${todo.description}</td>
                        <td>${todo.targetDate}</td>
                        <td>${todo.done}</td>
                        <td><a href="delete-todo?id=${todo.id}" type="button" class="btn btn-danger">Delete Todo</a>
                        </td>
                        <td><a href="update-todo?id=${todo.id}" type="button" class="btn btn-success">Update
                            Todo</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
            <a href="add-todo" type="button" class="btn btn-success">Add Todo</a>

        </h3>
    </div>
</div>
<%@ include file="common/footer.jspf" %>