import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DBServlet extends HttpServlet {
    private static final String URL = "jdbc:mysql://localhost:3306/garage91_db?useSSL=false";
    private static final String USER = "root";
    private static final String PASS = "";  // Empty password for XAMPP

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head><link href='https://fonts.googleapis.com/css2?family=Poppins:wght@400;600&display=swap' rel='stylesheet'></head>");
        out.println("<body style='font-family:Poppins,sans-serif;background-color:#121212;color:#ffffff;text-align:center;padding:20px;'>");
        out.println("<div style='background:#1f1f1f;padding:30px;border-radius:10px;max-width:600px;margin:auto;box-shadow:0 0 10px #ff5e00;'>");
        out.println("<h2 style='color:#ff5e00;'>Garage91 Accessories Inventory</h2>");
        out.println("<table style='width:100%;border-collapse:collapse;color:#ffffff;'>");
        out.println("<tr style='background:#ff5e00;'><th>ID</th><th>Name</th><th>Price</th><th>Stock</th></tr>");

        Connection con = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");  // Updated to match your reference programs
            con = DriverManager.getConnection(URL, USER, PASS);
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM accessories");

            while (rs.next()) {
                out.println("<tr style='border-bottom:1px solid #2b2b2b;'><td>" + rs.getInt("id") + "</td><td>" + rs.getString("name") + "</td><td>" + rs.getDouble("price") + "</td><td>" + rs.getInt("stock") + "</td></tr>");
            }
            rs.close();
        } catch (Exception e) {
            out.println("<h3 style='color:red;'>⚠️ Error:</h3>");
            out.println("<pre>" + e.toString() + "</pre>");  // Matches reference error handling
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        out.println("</table>");
        out.println("<p><a href='forms.html' style='color:#ff5e00;font-weight:600;text-decoration:none;'>Back to Forms</a></p>");
        out.println("</div></body></html>");
        out.close();
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");

        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");  // Updated to match references
            con = DriverManager.getConnection(URL, USER, PASS);

            if ("insert".equals(action)) {
                PreparedStatement ps = con.prepareStatement("INSERT INTO accessories (name, price, stock) VALUES (?, ?, ?)");
                ps.setString(1, request.getParameter("name"));
                ps.setDouble(2, Double.parseDouble(request.getParameter("price")));
                ps.setInt(3, Integer.parseInt(request.getParameter("stock")));
                ps.executeUpdate();
            } else if ("update".equals(action)) {
                PreparedStatement ps = con.prepareStatement("UPDATE accessories SET stock = ? WHERE id = ?");
                ps.setInt(1, Integer.parseInt(request.getParameter("stock")));
                ps.setInt(2, Integer.parseInt(request.getParameter("id")));
                ps.executeUpdate();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        response.sendRedirect("DBServlet");
    }
}