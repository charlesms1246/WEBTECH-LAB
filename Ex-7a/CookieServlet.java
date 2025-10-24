import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CookieServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String user = req.getParameter("username");
        Cookie c = new Cookie("username", user);
        res.addCookie(c);

        out.println("<html><body style='background:#121212;color:white;font-family:Poppins;'>");
        out.println("<h3>Welcome, " + user + "!</h3>");
        out.println("<p>Cookie has been set successfully.</p>");
        out.println("<a href='ShowCookieServlet'>Next Page</a>");
        out.println("</body></html>");
    }
}
