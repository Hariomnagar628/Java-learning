import java.util.*;
public class Pattern14{
   public static void main(String [] args)
   {

     
      // Scanner input = new Scanner(System.in);
      // int number = input.nextInt();
     
      
      for(int i=5;i>0;i--)
      {
         
         for(int j=5;j>0;j--)
         
         {
            if(i>=j)
            {
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
         }
        
         System.out.println();
      }
      

    
   }
}