import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String user = req.getParameter("username");
        String encodedURL = res.encodeURL("WelcomeServlet?user=" + user);

        out.println("<html><body style='background:#121212;color:white;font-family:Poppins;'>");
        out.println("<h3>Welcome, " + user + "!</h3>");
        out.println("<a href='" + encodedURL + "' style='color:#f15a24;'>Continue to Dashboard</a>");
        out.println("</body></html>");
    }
}
