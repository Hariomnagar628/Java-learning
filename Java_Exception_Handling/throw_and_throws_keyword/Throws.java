package Java_Exception_Handling.throw_and_throws_keyword;

import java.io.*;

// We use the throws keyword in the method declaration to declare the type of exceptions that might occur within it.


    
public class Throws {
    



    // declareing the type of exception
    public static void findfile() throws IOException
   
    {

         // code that may generate IOException

         File file =  new File("text.tx");

         FileInputStream stream = new FileInputStream(file);


    }



   public static void main(String[] args) {
    

    try{
        findfile();
    }catch(IOException e){

        System.out.println(e);
    }



   }



}
