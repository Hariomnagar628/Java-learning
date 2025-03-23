import java.sql.*;

class student{
    static int x=10;
     int y=10;
  }
  




class Practice {
   
      public static void main(String[] args) {  
        
      student obj1 = new student();
      student obj2 = new student();
    
      System.out.println(obj1.x);
      System.out.println(obj1.y);
        
      obj1.x=50;
      obj1.y=50;

      System.out.println(obj1.y);
      System.out.println(obj2.y);
          



    }
}
