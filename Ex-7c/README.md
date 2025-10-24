Experiment 7c – Session Using Hidden Form Fields

Deliverables Satisfied:
- Demonstrates session transfer using <input type="hidden">
- Two servlets created (LoginServlet, NextServlet)
- Data (username) passed between pages without cookies or URL rewriting
- Clean Garage91 theme applied

Run Steps:
1. Compile both servlets:
   javac -classpath "C:\apache-tomcat-10\lib\servlet-api.jar" -d WEB-INF\classes LoginServlet.java NextServlet.java
2. Copy Ex7c_HiddenFields folder to Tomcat\webapps\
3. Start Tomcat:
   C:\apache-tomcat-10\bin\startup.bat
4. Visit:
   http://localhost:8080/Ex7c_HiddenFields/index.html
5. Enter your name → Continue → hidden field passes data to second servlet.
