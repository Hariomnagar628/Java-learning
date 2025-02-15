import java.util.ArrayList;
import java.util.Collections;
public class Arraylist1 {
public static void main(String[] args) {
    ArrayList<Integer> nums = new ArrayList<Integer>();
   nums.add(34);
   nums.add(54);
   nums.add(78);
   nums.add(89);
   nums.add(9);

   Collections.sort(nums,Collections.reverseOrder());
   for(int i:nums)
   {
    System.out.println(i);
   }

}    
}
