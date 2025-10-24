import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class WelcomeServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String user = req.getParameter("user");

        out.println("<html><body style='background:#121212;color:white;font-family:Poppins;'>");
        out.println("<h2>Garage91 Dashboard</h2>");
        out.println("<p>Welcome back, <b style='color:#f15a24;'>" + user + "</b>!</p>");
        out.println("</body></html>");
    }
}
