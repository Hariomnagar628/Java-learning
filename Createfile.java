import java.io.File; 
import java.io.IOException;
import java.io.FileWriter;

public class Createfile {  
  public static void main(String[] args) {  
    try {  
      File myObj = new File("newfile.txt");
      if (myObj.createNewFile()) {  
        System.out.println("File created: " + myObj.getName());  
      } else {  
        System.out.println("File already exists.");  
      }  
       
      FileWriter newobj = new FileWriter("newfile.txt");  
      newobj.write("Hello World!");
      newobj.close();
      System.out.println("Succesfully wrote to the file");
    } 
    
    catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();  
    }  
  }  
} 
