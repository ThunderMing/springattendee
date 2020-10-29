# springattendee - Customer Relationship Management

## Development of Environment and Version
    Operating System: window 10
    IDE: STS
    JDK: JDK 1.8
    Web Server: Tomcat 9.0
    Database: MySQL 8.0
## System Frameworks
    Spring 
    Spring MVC
    Spring CLoud 
    Logback Blog
    Maven
    Spring Boot
## The Key techniques
    Spring + SpringMVC + Spring Boot
    Ajax
    Opencsv
    Jackson-databind
    Redis Cache
    JavaMail mail
    xlsx file
    Log management based on AOP 
    Login verification
    Rich text input box
## Note
    1. The project database is located in the first level directory named CRM.sql, where the "user" table is the account table
    2. Before delopying the project, you need to configure the MySQL databse, Redis database and mail mailbox. Thiese three configuration files are located in crm/src/main/resources/properties
    3. Login page: if http://localhost:8080/crm/pages/login.jsp is deployed locally, the port number and project name should be consistent twith the deployed environment
    4. Orders can be in the customer churn(whether the Spring timer detects customer churn) module, click the ccustomer details, you can view the customer's historical orders, order data, because in the enterprise model,the order data comes from the dales system, but because there is no external sales system, so order data and product will insert themselves into the database. 
