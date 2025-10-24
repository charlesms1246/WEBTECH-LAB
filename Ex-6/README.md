Experiment 6 - Basic Servlets

Deliverables Satisfied:
------------------------
✅ HTML file invokes a servlet via form (index.html)
✅ Servlet created and responds with HTML content (HelloServlet.java)
✅ Servlet mapped in web.xml (servlet-name + url-pattern)
✅ Response displayed neatly in Garage91 theme

How to Run:
------------
1. Place all files inside your Tomcat webapps folder (e.g., webapps/Ex6_BasicServlet).
2. Compile the servlet:
   > javac -classpath "path/to/tomcat/lib/servlet-api.jar" -d WEB-INF/classes HelloServlet.java
3. Start Tomcat server.
4. Open browser and visit:
   http://localhost:8080/MyServlets/index.html
5. Fill form → Submit → Servlet responds with formatted data.

Output:
--------
Displays a "Thank You" message showing submitted name, email, and message.
