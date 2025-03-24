package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Preparedstatement1 {

    public static void main(String[] args) {
        

            
        try{
           
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Students","root","Root@1234");


            //   ? -> called placeholder.

            // retrive the data 
            String query = "select subject from Studentdata where id=?";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,5);
         


      ResultSet resultset = preparedStatement.executeQuery();

      


       if(resultset.next())
       {
       
        
                System.out.println("subject : "+resultset.getString("subject"));
       }else{
        System.out.println("subject not found");
       }

            
           



            
        }catch(SQLException e)
        {
            System.out.println(e.getMessage());

        }

       
     



    }
}
