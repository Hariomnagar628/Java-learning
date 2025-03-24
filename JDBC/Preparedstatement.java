package JDBC;
import java.sql.*;

public class Preparedstatement {
    public static void main(String[] args) {
        
    //  ✅ Why We Use PreparedStatement in Java JDBC
// PreparedStatement is used instead of plain Statement for better performance, security, and cleaner code when interacting with databases.


        


        try{
           
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Students","root","Root@1234");


            //   ? -> called placeholder.
            String query = "INSERT INTO Studentdata(id,name,subject,age) VALUES (?,?,?,?)";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            // // Record 1
            // preparedStatement.setInt(1,5);
            // preparedStatement.setString(2,"Ankita");
            // preparedStatement.setString(3,"English");
            // preparedStatement.setInt(4,22);
            // preparedStatement.executeUpdate();


            // Record 2 
           preparedStatement.setInt(1, 6);
           preparedStatement.setString(2, "Raj");
           preparedStatement.setString(3, "Math");
           preparedStatement.setInt(4, 23);
           preparedStatement.executeUpdate();

          // Record 3
          preparedStatement.setInt(1, 7);
          preparedStatement.setString(2, "Priya");
          preparedStatement.setString(3, "History");
          preparedStatement.setInt(4, 20);

       int x  = preparedStatement.executeUpdate();


       if(x>0)
       {
        System.out.println("Data inserted successfully");

       }else{
        System.out.println("Data will be not inserted");
       }

            
           



            
        }catch(SQLException e)
        {
            System.out.println(e.getMessage());

        }

       
     



    }
}
