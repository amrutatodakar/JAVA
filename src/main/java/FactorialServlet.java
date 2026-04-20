import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FactorialServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Get input
        int num = Integer.parseInt(request.getParameter("num"));

        // Calculate factorial
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        // Display output
        out.println("<html><body>");
        out.println("<h2>Factorial of " + num + " is: " + fact + "</h2>");
        out.println("</body></html>");
    }
}