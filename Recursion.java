import java.util.*;
public class Recursion {

         public static void num(int n)
         {
            if(n==0)
            {
                return;
            }

            num(n-1);
            System.out.println(n);
         }

            public static void main(String[] args) {
                 num(5);        
            }   
}
