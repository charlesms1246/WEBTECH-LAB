import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class WelcomeServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession(false);

        if (session != null && session.getAttribute("username") != null) {
            String user = (String) session.getAttribute("username");
            String pass = (String) session.getAttribute("password");

            out.println("<html><head>");
            out.println("<link href='https://fonts.googleapis.com/css2?family=Poppins:wght@400;600&display=swap' rel='stylesheet'>");
            out.println("<style>");
            out.println("body {font-family:'Poppins',sans-serif;background-color:#121212;color:white;text-align:center;padding-top:120px;}");
            out.println(".card {background:#1f1f1f;padding:40px;border-radius:12px;display:inline-block;box-shadow:0 0 12px #ff5e00;}");
            out.println("button {background:#ff5e00;border:none;padding:10px 20px;border-radius:6px;color:white;font-weight:600;cursor:pointer;transition:0.3s;}");
            out.println("button:hover {background:#ff7b29;}");
            out.println("</style></head><body>");
            out.println("<div class='card'>");
            out.println("<h1 style='color:#ff5e00;'>Welcome, " + user + "!</h1>");
            out.println("<p>Your password is: <b style='color:#ff7b29;'>" + pass + "</b></p>");
            out.println("<p>Session active — enjoy browsing Garage91 accessories.</p>");
            out.println("<form method='post' action='WelcomeServlet'><button>Logout</button></form>");
            out.println("</div></body></html>");
        } else {
            response.sendRedirect("index.html");
        }
        out.close();
    }
}