package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Preparedstatement2 {

    public static void main(String[] args) {
        

            
        try{
           
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Students","root","Root@1234");


            //   ? -> called placeholder.

            // update 
            String query = "update  Studentdata set subject = ?  where id = ? ";


            // for delete 
            // String query = "delete from Studentdata where id = ?";


            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,"Machine Learning");
            preparedStatement.setInt(2,5);



         


     int x =  preparedStatement.executeUpdate();
       


       if(x>0)
       {
       
        System.out.println("Data update success");
               
       }else{
        System.out.println("failed to update");
       }

            
           



            
        }catch(SQLException e)
        {
            System.out.println(e.getMessage());

        }

       
     



    }
}
