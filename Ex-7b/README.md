Experiment 7b – Session Using URL Rewriting

Deliverables Satisfied:
- Two servlets (LoginServlet and WelcomeServlet)
- URL rewriting technique used to pass username between servlets
- No cookies or sessions used
- Garage91 theme applied consistently
- Proper servlet mapping and response output

Run Steps:
1. Compile both servlets:
   javac -classpath "C:\apache-tomcat-10\lib\servlet-api.jar" -d WEB-INF\classes LoginServlet.java WelcomeServlet.java
2. Copy Ex7b_URLRewriting folder to Tomcat\webapps\
3. Start Tomcat:
   C:\apache-tomcat-10\bin\startup.bat
4. Visit:
   http://localhost:8080/Ex7b_URLRewriting/index.html
5. Enter a username → click Login → then click “Continue to Dashboard” → name passed via URL.
