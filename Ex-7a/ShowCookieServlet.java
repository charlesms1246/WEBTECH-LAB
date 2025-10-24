import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ShowCookieServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        Cookie[] cookies = req.getCookies();
        String user = "Guest";

        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("username")) user = c.getValue();
            }
        }

        out.println("<html><body style='background:#121212;color:white;font-family:Poppins;'>");
        out.println("<h3>Hello again, " + user + "!</h3>");
        out.println("<p>Your cookie data has been retrieved successfully.</p>");
        out.println("</body></html>");
    }
}
