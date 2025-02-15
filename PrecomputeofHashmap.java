import java.util.*;
public class PrecomputeofHashmap {
 
     public static void main(String [] args)
     {
        
         System.out.print("Enter the size of array");
         Scanner input = new Scanner(System.in);
         int size = input.nextInt();

          int [] arr = new int[size];
          for(int i=0;i<size;i++) 
          {
              
           arr[i] = input.nextInt();

          }
                for(int num:arr)
                {
                    System.out.print(num+" ");
                }
         
     

           int [] hash = new int[13];
           for(int i=0;i<size;i++)
           {
                 hash[arr[i]]+=1;
           }

                 

       System.out.print("Enter the size");
       
       int newsize = input.nextInt();

     for(int i=0;i<newsize;i++)
     {
         int x = input.nextInt();
         System.out.println();
         System.out.println(hash[x]);


     }

     



}
} 