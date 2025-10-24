Experiment 7a – Session Using Cookies

Deliverables Satisfied:
- Two servlets created (CookieServlet and ShowCookieServlet)
- Cookie used to store and retrieve username
- HTML page collects user input (Garage91-themed)
- Proper output shown confirming cookie usage

Run Steps:
1. Compile both servlets:
   javac -classpath "C:\apache-tomcat-10\lib\servlet-api.jar" -d WEB-INF\classes CookieServlet.java ShowCookieServlet.java
2. Copy Ex7a_Cookies folder to Tomcat\webapps\
3. Start Tomcat:
   C:\apache-tomcat-10\bin\startup.bat
4. Open:
   http://localhost:8080/Ex7a_Cookies/index.html
5. Enter a name → submit → cookie set → click “Next Page” → cookie retrieved.
