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
        <h2>Session expired!</h2>
        <a href="index.jsp">Start Again</a>
<%
    }
%>

</body>
</html>