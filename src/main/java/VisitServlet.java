import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VisitServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("username");
        int visitCount = 1;

        Cookie cookies[] = request.getCookies();

        // Check existing visit count
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("visitCount")) {
                    visitCount = Integer.parseInt(c.getValue());
                    visitCount++;
                }
            }
        }

        // Create/update visit cookie
        Cookie visitCookie = new Cookie("visitCount", String.valueOf(visitCount));

        // Set expiry (important)
        visitCookie.setMaxAge(30);  // expires in 30 seconds

        response.addCookie(visitCookie);

        // Output
        out.println("<html><body>");
        out.println("<h2>Welcome back " + name + "!</h2>");
        out.println("<h3>You have visited this page " + visitCount + " times.</h3>");
        out.println("<p>(Cookie expires in 30 seconds)</p>");

        // Show all cookies with name and value
        out.println("<h3>List of Cookies with Values:</h3>");

        if (cookies != null) {
            for (Cookie c : cookies) {
                out.println("<b>Name:</b> " + c.getName() + "<br>");
                out.println("<b>Value:</b> " + c.getValue() + "<br><br>");
            }
        } else {
            out.println("No cookies available.");
        }

        out.println("</body></html>");
    }
}