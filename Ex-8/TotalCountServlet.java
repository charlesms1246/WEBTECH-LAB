import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class TotalCountServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        ServletContext context = getServletContext();
        Integer count = (Integer) context.getAttribute("totalCount");
        if (count == null) {
            count = 0;
        }
        count++;
        context.setAttribute("totalCount", count);

        out.println("<html><head><link href='https://fonts.googleapis.com/css2?family=Poppins:wght@400;600&display=swap' rel='stylesheet'></head>");
        out.println("<body style='font-family:Poppins,sans-serif;background-color:#121212;color:#ffffff;text-align:center;padding:50px;'>");
        out.println("<div style='background:#1f1f1f;padding:40px;border-radius:10px;max-width:400px;margin:auto;box-shadow:0 0 10px #ff5e00;'>");
        out.println("<h2 style='color:#ff5e00;'>Garage91 Total Page Hits</h2>");
        out.println("<p style='font-size:24px;'>Total accesses by all users: <b style='color:#ff7b29;'>" + count + "</b></p>");
        out.println("<a href='total_count.html' style='color:#ff5e00;font-weight:600;text-decoration:none;'>Back</a>");
        out.println("</div></body></html>");
        out.close();
    }
}