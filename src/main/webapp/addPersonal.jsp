<%@ page import="java.util.List" %>
<%@ page isELIgnored = "false" %>
<%@ page import="com.login.entity.Personal" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>JSP Application</title>
</head>
<body>

<form method="post">
    <label>Name:
        <input type="text" name="name"><br />
    </label>

    <label>Login:
        <input type="text" name="login"><br />
    </label>

    <label>Password:
        <input type="text" name="password"><br />
    </label>
    <button type="submit">Registration</button>
</form>

</body>
</html>