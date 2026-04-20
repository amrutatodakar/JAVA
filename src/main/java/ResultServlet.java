import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ResultServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String roll = request.getParameter("rollno");
        String name = request.getParameter("name");

        int sub1 = Integer.parseInt(request.getParameter("sub1"));
        int sub2 = Integer.parseInt(request.getParameter("sub2"));
        int sub3 = Integer.parseInt(request.getParameter("sub3"));
        int sub4 = Integer.parseInt(request.getParameter("sub4"));
        int sub5 = Integer.parseInt(request.getParameter("sub5"));

        // Server-side validation
        if (roll.isEmpty() || name.isEmpty()) {
            response.getWriter().println("Error: Fields cannot be empty!");
            return;
        }

        int marks[] = {sub1, sub2, sub3, sub4, sub5};

        for (int m : marks) {
            if (m < 0 || m > 100) {
                response.getWriter().println("Error: Invalid marks!");
                return;
            }
        }

        // Calculate average
        double avg = (sub1 + sub2 + sub3 + sub4 + sub5) / 5.0;

        // Check pass condition
        boolean pass = true;
        for (int m : marks) {
            if (m < 40) {
                pass = false;
                break;
            }
        }

        String result = pass ? "PASS" : "FAIL";

        // Send data to JSP
        request.setAttribute("roll", roll);
        request.setAttribute("name", name);
        request.setAttribute("sub1", sub1);
        request.setAttribute("sub2", sub2);
        request.setAttribute("sub3", sub3);
        request.setAttribute("sub4", sub4);
        request.setAttribute("sub5", sub5);
        request.setAttribute("average", avg);
        request.setAttribute("result", result);

        RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
        rd.forward(request, response);
    }
}