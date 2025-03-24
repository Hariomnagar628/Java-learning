package JDBC;
import java.sql.*;
public class InsertDataintodatabase {
    
    public static void main(String[] args) {

        
        try{
           
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Students","root","Root@1234");
            Statement statement = connection.createStatement();
            
            
            // Insert the data into table;
            // String query = String.format("INSERT INTO Studentdata(id,name,subject,age) VALUES (%d,'%s','%s',%d)",5,"Rahul","Art",23);

            // String query = "INSERT INTO Studentdata(id,name,subject,age) VALUES (5,"Rahul","Art",23);

             // String query1 = "INSERT INTO Studentdata(id,name,subject,age) VALUES (6,"Sahil","Art",22);

             // if i want to insert multiple data then execute the multiple query in every insert so solve this problem PreparedStatement will be use ;


             



            // Update into table
            //  String query = String.format("UPDATE Studentdata SET age = %d WHERE id=5",45,5);

            // Delete data
            String query = "DELETE  FROM Studentdata WHERE id=5";
            int value = statement.executeUpdate(query);

            if(value>0)
            {
                System.out.println("Data Inserted Sucessfully");
            }
            else{
                System.out.println("Data not Inserted");
            }

            statement.close();
            connection.close();
            
                       
        }catch(SQLException e){

            System.out.println(e.getMessage());
        }




    }
}
