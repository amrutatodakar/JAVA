<%@ page import="javax.servlet.http.Cookie" %>

<html>
<body>

<h2>Active Cookie List</h2>

<%
    Cookie cookies[] = request.getCookies();

    if (cookies != null) {
        for (Cookie c : cookies) {
%>
            <p>
                Name: <%= c.getName() %> <br>
                Value: <%= c.getValue() %> <br><br>
            </p>
<%
        }
    } else {
%>
        <p>No active cookies found.</p>
<%
    }
%>

</body>
</html>