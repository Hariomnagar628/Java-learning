package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// What is Batch Processing?
// Batch processing is a technique in which multiple data operations (such as insert, update, or delete) are executed in a single batch rather than processing each operation separately. It improves performance by reducing the number of database hits and enhancing efficiency.

// Instead of executing multiple individual SQL queries separately, batch processing groups them together and sends them to the database in one go. This is particularly useful when dealing with large volumes of data.



public class Batchprocessing {
    
    public static void main(String[] args) {

        
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Persons","root","Root@1234");

            String query = "insert into PersonDetails(PersonID,FirstName,LastName,City,Email) values (?,?,?,?,?)";


            PreparedStatement prepstmt = connection.prepareStatement(query);

            prepstmt.setInt(1,1004);
            prepstmt.setString(2,"Raj");
            prepstmt.setString(3,"Soni");
            prepstmt.setString(4,"Indore");
            prepstmt.setString(5,"rajsoni43*@gmail.com");
            prepstmt.addBatch();




            prepstmt.setInt(1, 1005);
            prepstmt.setString(2, "Rohan");
            prepstmt.setString(3, "Sahu");
            prepstmt.setString(4,"Delhi");
            prepstmt.setString(4,"rohan23@gamil.com");
            prepstmt.addBatch(); // Add to batch

       
            int [] reslt = prepstmt.executeBatch();
            System.out.println(reslt.length+"row are inserted");

            
        }catch(SQLException e)

        {

        System.out.println(e.getMessage());

        }


    }
}
