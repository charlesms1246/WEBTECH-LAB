import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Create a new session
        HttpSession session = request.getSession();
        session.setAttribute("username", username);
        session.setAttribute("password", password);

        response.sendRedirect("WelcomeServlet");
    }
}
