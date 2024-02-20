<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
</head>
<body>
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
</body>
</html>