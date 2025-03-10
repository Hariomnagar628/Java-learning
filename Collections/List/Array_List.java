 package Collections.List;

 import java.util.*;
   import java.util.ArrayList;
    import java.util.List;


public class Array_List {


     public static void main(String[] args) {
   
 
          ArrayList<Integer>arraylist1 = new ArrayList();
         
          // List<Integer>arraylist2 = new ArrayList();
          

            arraylist1.add(45);
            arraylist1.add(56);
            arraylist1.add(23);
            arraylist1.add(45);
            
          //   System.out.println( arraylist1.get(0));


          //   for(int i=0;i<arraylist1.size();i++)
          //   {
          //      System.out.println(arraylist1.get(i));
          //   }


        
          //  System.out.println(arraylist1.contains(45));


           arraylist1.remove(2);

        

            arraylist1.add(2,56);

            arraylist1.set(2, 6565);


          //   for(int i:arraylist1)
          //   {
          //      System.out.println(i);
          //   }

           
          


         System.out.println(arraylist1);

         
         //Sorting the Arraylist

         Collections.sort(arraylist1);

         //sorting  in decanding order (a,b)->b-a using lambda expresion 
         arraylist1.sort((a,b)->b-a);

         System.out.println(arraylist1);

        
     }
}