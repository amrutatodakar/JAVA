import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CookieServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("username");

        int visitCount = 1;

        // Get cookies
        Cookie cookies[] = request.getCookies();

        if (cookies != null) {
            for (Cookie c : cookies) {

                // Check if cookie exists
                if (c.getName().equals("visitCount")) {
                    visitCount = Integer.parseInt(c.getValue());
                    visitCount++;
                }
            }
        }

        // Create / update cookie
        Cookie visitCookie = new Cookie("visitCount", String.valueOf(visitCount));

        // 🔥 Cookie expiry time (Demo)
        visitCookie.setMaxAge(30);   // expires in 30 seconds

        response.addCookie(visitCookie);

        // Display output
        out.println("<html><body>");
        out.println("<h2>Welcome back " + name + "!</h2>");
        out.println("<h3>You have visited this page " + visitCount + " times.</h3>");
        out.println("<p>(Cookie expires in 30 seconds)</p>");
        out.println("</body></html>");
    }
}