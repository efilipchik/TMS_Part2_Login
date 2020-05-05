
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>
    <%
        String name = (String) session.getAttribute("name");
        out.print("Hello " + name);
    %>
</p>

<form action="http://localhost:8989/TMS_Part2_Login_war/loginPersonal">

    <p>
        <%
            session.invalidate();
        %>
    </p>
    <button class="logout">Logout</button>
</form>

</body>
</html>
