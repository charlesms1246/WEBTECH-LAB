# Experiment 7d — HttpSession Management (Garage91 Theme)

## 🎯 Objective
To demonstrate user session handling using HttpSession in Java Servlets while following Garage91’s dark-orange branding.

## 🧩 Files
- `index.html` — Login form with Garage91 theme colors.
- `LoginServlet.java` — Stores username & password in session.
- `WelcomeServlet.java` — Displays user data, allows logout, and destroys session.
- `web.xml` — Servlet configuration.

## ⚙️ Steps to Run
1. Place `Ex7d_HttpSession` in `webapps` under your Apache Tomcat directory.
2. Start Tomcat (`startup.bat` or `startup.sh`).
3. Visit → [http://localhost:8080/Ex7d_HttpSession/index.html](http://localhost:8080/Ex7d_HttpSession/index.html)
4. Enter any username and password.
5. You’ll be redirected to a session-based welcome page.
6. Click **Logout** to end your session and return to login.

## ✅ Deliverables Satisfied
- Uses only **two servlets** (`LoginServlet`, `WelcomeServlet`).
- Employs **HttpSession** for session creation, retrieval, and invalidation.
- Accepts **dynamic user input** (no hardcoded credentials).
- The interface follows **Garage91’s dark + orange theme** exactly.
- Submission-ready and minimal.
