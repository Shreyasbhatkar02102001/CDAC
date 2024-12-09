![alt text](image.png)

1. What is JDBC ?

- > It's an API ( Java.sql; | javax.sql ) for connecting to Database and perform CRUD operations.

2. Why JDBC ? 

- > It allows developers to build java applications which are 

    - platform independent + DB independent (partial)

    2.1. Whats makes JDBC DB indepedent ?

    1. JDBC driver - its 2 way convertor

    java to db
    <!-- wise - vera -->
    db to java


    2. JDBC API - mainly consists of interfaces ( specification - what is to be done )

        eg - Connection, Statement, PreparedStatement, ResultSet.....

        Implementations ( HOW )of JDBC API - is left to Vendors ( DB vendor or 3rd party vendors ) 

----

![alt text](image-1.png)

- can we use interface reference can refer to implementation class ? = upcasting yes

---

    eg - Connectioni/f (interface) <----
    MySQlConnectionImpl, OracleConnImpl,
    PostgressConnImpl, 


![alt text](image-2.png)

why interfaces so popular / required ?

-   abstract methods : implementation is done in implementation class 
therefore is called loosed coupling

- multiple interfaces

3. JDBC Drivers - Connector / translator


different types of JDBC drivers

![alt text](image-3.png)

study about it's types

4. Generic development steps in JDBC and implementation

    4.0 In earlier version, it was mandatory to load JDBC drivers first.

    ![alt text](image-5.png)

    now it is not required of JDBC 

    4.1 Connect to DB

    ![alt text](image-4.png)

    ![alt text](image-6.png)

    root is username and password

    ![alt text](image-7.png)

    ![alt text](image-8.png)

    ![alt text](image-9.png)
    implementation class

    4.2 Fetch users from DB and display the same

    (test statement)

    Dev steps 

    1. Get Connections

    2. Create Statement to hold SQL, from the Connection

    Use Connection i/f method

    public Statement createStatement() throws  SQLException
    
    ![alt text](image-10.png)

    3. Execute Query

    ![alt text](image-11.png)

    ![alt text](image-12.png)

    4. ResultSet

    processingSet of ResultSet - before the 1st row

    ![alt text](image-13.png)

    ![alt text](image-14.png)

    ![alt text](image-15.png)

    ![alt text](image-16.png)

    JVM - rst, st, cn .close() =>  cleaning up of DB resources

    print each record in newline '%n' in query

    o/p
    ![alt text](image-17.png)

    6. test preparedStatement

    ![alt text](image-18.png)

    ![alt text](image-19.png)

    API of Connection

    public PreparedStatement prepareStatement(String sql)
    throws SQLException

    ![alt text](image-20.png)

    ![alt text](image-21.png)

    ![alt text](image-22.png)

    ![alt text](image-23.png)    

    ![alt text](image-24.png)

    Madhura mam number : 
    ![alt text](image-25.png)

    7. Identify need of layers

    ORM = Object Relational Mapping

    ![alt text](image-26.png)

    ![alt text](image-27.png)

    ![alt text](image-28.png)    

