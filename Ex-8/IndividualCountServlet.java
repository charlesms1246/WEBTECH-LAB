import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class IndividualCountServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String username = request.getParameter("username");

        // Use ServletContext for global storage of per-user counts (with generics and type check)
        ServletContext context = getServletContext();
        Object attr = context.getAttribute("userCounts");
        Map<String, Integer> userCounts;
        if (attr instanceof Map) {
            @SuppressWarnings("unchecked")  // Suppress the unchecked cast warning
            Map<String, Integer> temp = (Map<String, Integer>) attr;  // Safe after instanceof
            userCounts = temp;
        } else {
            userCounts = new HashMap<String, Integer>();
            context.setAttribute("userCounts", userCounts);
        }

        // Increment count for this username (starts over if new name)
        Integer count = userCounts.getOrDefault(username, 0);
        count++;
        userCounts.put(username, count);

        out.println("<html><head><link href='https://fonts.googleapis.com/css2?family=Poppins:wght@400;600&display=swap' rel='stylesheet'></head>");
        out.println("<body style='font-family:Poppins,sans-serif;background-color:#121212;color:#ffffff;text-align:center;padding:50px;'>");
        out.println("<div style='background:#1f1f1f;padding:40px;border-radius:10px;max-width:400px;margin:auto;box-shadow:0 0 10px #ff5e00;'>");
        out.println("<h2 style='color:#ff5e00;'>Garage91 Individual Page Hits</h2>");
        out.println("<p style='font-size:24px;'>Hello, <b style='color:#ff7b29;'>" + username + "</b>!</p>");
        out.println("<p style='font-size:24px;'>You have visited " + count + " time(s).</p>");
        out.println("<a href='individual_count.html' style='color:#ff5e00;font-weight:600;text-decoration:none;'>Back</a>");
        out.println("</div></body></html>");
        out.close();
    }
}