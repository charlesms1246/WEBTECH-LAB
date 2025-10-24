import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String name = req.getParameter("username");
        String email = req.getParameter("email");
        String message = req.getParameter("message");

        out.println("<html><body style='background-color:#121212; color:white; font-family:Poppins;'>");
        out.println("<h2>Thank You for Contacting Garage91!</h2>");
        out.println("<p><b>Name:</b> " + name + "</p>");
        out.println("<p><b>Email:</b> " + email + "</p>");
        out.println("<p><b>Message:</b> " + message + "</p>");
        out.println("<p style='color:#ff5e00;'>We'll get back to you soon!</p>");
        out.println("</body></html>");
    }
}
