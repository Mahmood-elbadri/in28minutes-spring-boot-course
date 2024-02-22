<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
<div class="container">
    <h1>Welcome Again to login page ${name}</h1>
    <form method="post">
        <div>
            <pre>${error}</pre>
            <label id="username">Name</label>
            <input type="text" name="username">
        </div>
        <div>
            <label id="password">Password</label>
            <input type="password" name="password">
        </div>
        <div>
            <button type="submit">Submit</button>
        </div>
    </form>
</div>
<%@ include file="common/footer.jspf" %>
