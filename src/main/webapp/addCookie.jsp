<%@ page import="javax.servlet.http.Cookie" %>

<%
    String name = request.getParameter("cname");
    String domain = request.getParameter("cdomain");
    int age = Integer.parseInt(request.getParameter("cage"));

    // Create cookie
    Cookie cookie = new Cookie(name, "Active");

    // Set domain and expiry
    cookie.setDomain(domain);
    cookie.setMaxAge(age);

    // Add cookie to response
    response.addCookie(cookie);
%>

<html>
<body>

<h2>Cookie Added Successfully!</h2>

<p>Cookie Name: <%= name %></p>
<p>Domain: <%= domain %></p>
<p>Expiry Time: <%= age %> seconds</p>

<br>
<a href="showCookies.jsp">Go to Active Cookie List</a>

</body>
</html>