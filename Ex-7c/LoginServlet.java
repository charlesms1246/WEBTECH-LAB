import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        String user = req.getParameter("username");

        out.println("<html><body style='background:#121212;color:white;font-family:Poppins;'>");
        out.println("<h3>Welcome, " + user + "!</h3>");
        out.println("<form action='NextServlet' method='post'>");
        out.println("<input type='hidden' name='username' value='" + user + "'>");
        out.println("<button type='submit' style='background:#f15a24;color:white;padding:8px;border:none;border-radius:6px;'>Continue</button>");
        out.println("</form>");
        out.println("</body></html>");
    }
}
