<%
    String name = request.getParameter("username");
    int time = Integer.parseInt(request.getParameter("time"));

    // Store name in session
    session.setAttribute("username", name);

    // Set session expiry dynamically
    session.setMaxInactiveInterval(time);
%>

<html>
<body>

<h2>Hello <%= name %>!</h2>

<p>Session expiry time set to <%= time %> seconds.</p>

<a href="check.jsp">Check Session Status</a>

</body>
</html>