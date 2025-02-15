import java.util.*;

public class intersectionoftwoarrays {
    public static void main(String[] args) {


         int [] arr1 = {1,22,2,3,1,1,1};
         int [] arr2 = {2,22,54,1,1,4,2};

         Set<Integer> list1 = new HashSet<>();
         Set<Integer> list2 = new HashSet<>();

         for(int num:arr1)
         {
              list1.add(num);
         }

         for(int num:arr2)
         {
            if(list1.contains(num))
            {
                list2.add(num);
            }
         }

        System.out.println(list2);
        
    }
}
