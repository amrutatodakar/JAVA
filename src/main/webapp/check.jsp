<%
    String name = (String) session.getAttribute("username");

    out.println("<html><body>");

    if (name != null) {
        out.println("<h2>Hello " + name + "! Session is active.</h2>");
    } else {
        out.println("<h2>Session expired! Please enter your name again.</h2>");
    }

    out.println("</body></html>");
%>