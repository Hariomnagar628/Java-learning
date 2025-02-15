import java.util.*;
public class Twosumpairs {
          
      public static void main(String[] args) {
        int [] arr = {1,2,44,43};
        int target = 45;

        
       HashMap<Integer,Integer> map =  new HashMap<>();

       for(int num:arr)
       {
         
           if(map.containsKey(num))
           {

             System.out.println(map.get(num)+" "+num);


           }


           map.put(target-num,num);

       }


 


      }
}
 