import java.util.*;
public class Stringx {    
    public static void main(String[] args)
    {

         
     String name = "hariom";
     String name1 = "hariom";
     
     String  newname = new String("hariom");

// == to use this to compare any two strings. it  is basically check by refrences. 

     if(name==name1)
     {
        System.out.println("Both are same");
     }
     
     

     if(name==newname)
     {
        System.out.println("same");
     }
     else{
        System.out.println("not same");

     }

    }
    
}
 