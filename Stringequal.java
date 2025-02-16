import java.util.*;
public class Stringequal {

    public static void main(String[] args) {
         
        String name = "hariom";
        String name2 = "Hariom";
        String newname = new String("hariom");

        if(name.equals(newname))
        {
            System.out.println("it's same");
        }
        else{
            System.out.println("Not same");
        }
    

    if(name.equalsIgnoreCase(name2))
    {
        System.out.println("same");

    }
    
}
}