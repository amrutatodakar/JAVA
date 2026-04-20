<%
    String name = request.getParameter("username");

    // Create session and store name
    session.setAttribute("username", name);

    // Set session expiry = 60 seconds
    session.setMaxInactiveInterval(60);
%>

<html>
<body>

<h2>Hello <%= name %>!</h2>
<p>Session will expire in 1 minute.</p>

<a href="check.jsp">Check Session Status</a>

</body>
</html>