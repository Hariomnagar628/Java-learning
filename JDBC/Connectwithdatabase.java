package JDBC;
import java.util.*;
import java.sql.*;

public class Connectwithdatabase {
    
    private static final String url = "jdbc:mysql://localhost:3306/Students";
    private static final String username = "root";
    private static final String password = "Root@1234";



    public static void main(String[] args) {
     
      
      // 🔸 Newer versions (Java 6 and later):
      // ✅ No, it's not required anymore (in most cases) if the MySQL JDBC driver JAR is present in your classpath.
      
      // Because:
      
      // mysql-connector-java uses Java’s Service Provider Mechanism, which auto-registers the driver class (com.mysql.cj.jdbc.Driver) when the application starts.
      
      // So even if you remove that Class.forName(...) line, your code will still work in modern setups.
      
            try{

        Class.forName("com.mysql.cj.jdbc.Driver");
        
      }catch(ClassNotFoundException e)
      {

        System.out.println(e.getMessage());

      }


      try{

        Connection connection = DriverManager.getConnection(url,username,password);
        Statement statement = connection.createStatement();
        String query = "select * from Studentdata";
        ResultSet resultSet = statement.executeQuery(query);
        
        
        while (resultSet.next()) {
            
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String subject = resultSet.getString("subject");
            int age = resultSet.getInt("age");

            System.out.println("id : " + id);
            System.out.println("name : " + name);
            System.out.println("subject : " + subject);
            System.out.println("age : " + age);
            System.out.println();


        }

      }catch(SQLException e)
      {
        System.out.println(e.getMessage());
      }


    }





}
