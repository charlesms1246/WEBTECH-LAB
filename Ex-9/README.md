# Experiment 9 — DB Access using Servlets (Garage91 Theme)

## 🎯 Objective
To perform select, insert, and update operations on a MySQL DB using a Servlet, based on the Garage91 automobile accessories domain.

## 🧩 Files
- `forms.html` — Form for insert/update with Garage91 theme.
- `create_db.sql` — Script to create DB and table.
- `DBServlet.java` — Handles DB operations (select in doGet, insert/update in doPost).
- `web.xml` — Servlet configuration.

## ⚙️ Steps to Run (XAMPP Specific)
1. Start XAMPP Control Panel → Start Apache and MySQL modules.
2. Open phpMyAdmin[](http://localhost/phpmyadmin) → Import/Run `create_db.sql` to create the DB/table.
3. Compile DBServlet (use XAMPP's Tomcat if integrated, or standalone Tomcat):
   - Add mysql-connector-java.jar to your classpath (download if needed and place in XAMPP/tomcat/lib).
   - Run: `javac -classpath "C:\xampp\tomcat\lib\servlet-api.jar;C:\path\to\mysql-connector-java.jar" -d WEB-INF/classes src/DBServlet.java`
4. Copy the `Ex9_DBAccess` folder to XAMPP's `htdocs` or Tomcat's `webapps` folder (e.g., xampp/tomcat/webapps/Ex9_DBAccess).
5. Visit: `http://localhost:8080/Ex9_DBAccess/forms.html` (use port 8080 for Tomcat; adjust if different).
6. Add/Update items → View All to see changes.

## ✅ Deliverables Satisfied
- Servlet accesses localhost MySQL DB (no username/password required beyond default root/empty).
- Performs **insert**, **update**, and **select**.
- Uses Garage91 theme (dark #121212, orange #ff5e00, Poppins font).
- Minimal code, neat layout, submission-ready.