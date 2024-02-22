<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
<div class="container">
    <h1>Enter Todo Details ${name}</h1>
    <form:form method="post" modelAttribute="todo">
        <fieldset class="mb-4">
            <form:label path="description" id="description">Description</form:label>
            <form:input type="text" name="description" required="required" path="description"/>
            <form:errors path="description" cssClass="text-warning"/>
        </fieldset>
        <fieldset>

            <form:label path="targetDate" id="targetDate">TargetDate</form:label>
            <form:input type="date" name="targetDate" required="required" path="targetDate"/>
                <%--        <form:errors path="description" cssClass="text-warning"/>--%>
        </fieldset>
        <form:input type="hidden" path="id"/>
        <form:input type="hidden" path="done"/>
        <input type="submit" class="btn btn-success"/>
    </form:form>
</div>


<%@ include file="common/footer.jspf" %>
