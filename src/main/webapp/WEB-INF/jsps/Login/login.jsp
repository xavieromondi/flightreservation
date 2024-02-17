<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>User Login</title>
</head>
<body>
<h2>Login:</h2>
<form action="login" method="post">
    <pre>
        User Name:<input type="text" name="email">
        Password:<input type="password" name="password">
        <input type="submit" value="login">

    </pre>
    ${msg}
</form>
</body>
</html>