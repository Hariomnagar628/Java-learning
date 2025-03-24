package JDBC;
import java.util.*;
import java.sql.*;

public class Connectwithdatabase {
    
    private static final String url = "jdbc:mysql://localhost:3306/Students";
    private static final String username = "root";
    private static final String password = "Root@1234";



    public static void main(String[] args) {
        
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
