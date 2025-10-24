# Experiment 8 — User Hit Count (Garage91 Theme)

## 🎯 Objective
To track page accesses: Program 1 for total hits by all users; Program 2 for unique individual user hits with username input.

## 🧩 Files
- `total_count.html` — Entry for global count (Garage91 styled).
- `individual_count.html` — Entry for individual count with username field (Garage91 styled).
- `TotalCountServlet.java` — Handles global count using ServletContext.
- `IndividualCountServlet.java` — Handles individual count using ServletContext Map for per-username tracking.
- `web.xml` — Servlet mappings.

## ⚙️ Steps to Run
1. Compile servlets: `javac -classpath "path/to/tomcat/lib/servlet-api.jar" -d WEB-INF/classes src/*.java`
2. Place folder in Tomcat's `webapps`.
3. Start Tomcat.
4. Visit Program 1: `http://localhost:8080/Ex8_UserHitCount/total_count.html` → Refresh to increment global count.
5. Visit Program 2: `http://localhost:8080/Ex8_UserHitCount/individual_count.html` → Enter name → Submit to view/increment personal count (changes name to start over).

## ✅ Deliverables Satisfied
- Program 1: Tracks total page accesses (global via ServletContext).
- Program 2: Tracks unique user accesses (per username via ServletContext Map; count starts over on name change).
- Garage91 theme applied (dark #121212, orange #ff5e00, Poppins font).
- Minimal code, neat, submission-ready with Tomcat/VS Code compatibility.