<%
    String name = (String) session.getAttribute("username");
%>

<html>
<body>

<%
    if (name != null) {
%>
        <h2>Hello <%= name %>! Session is still active.</h2>
<%
    } else {
%>
        <h2>Session expired! Please enter your name again.</h2>
        <a href="index.jsp">Go Back</a>
<%
    }
%>

</body>
</html>