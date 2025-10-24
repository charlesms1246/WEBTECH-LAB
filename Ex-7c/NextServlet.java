import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class NextServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String user = req.getParameter("username");

        out.println("<html><body style='background:#121212;color:white;font-family:Poppins;'>");
        out.println("<h2>Garage91 Dashboard</h2>");
        out.println("<p>Hidden field value received successfully.</p>");
        out.println("<p>Welcome back, <b style='color:#f15a24;'>" + user + "</b>!</p>");
        out.println("</body></html>");
    }
}
