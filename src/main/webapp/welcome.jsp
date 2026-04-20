<%@ page import="java.io.*" %>
<%
    // Get name from form
    String name = request.getParameter("username");

    // Create session
    session.setAttribute("username", name);

    // Set session expiry time (60 seconds = 1 minute)
    session.setMaxInactiveInterval(60);

    out.println("<html><body>");
    out.println("<h2>Hello " + name + "!</h2>");
    out.println("<p>Session will expire in 1 minute.</p>");
    out.println("<a href='check.jsp'>Check Session</a>");
    out.println("</body></html>");
%>