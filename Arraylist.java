import java.util.ArrayList;
import java.util.Collections;
public class Arraylist {
    public static void main(String[] args) {
        
        // ArrayList<String> cars=new ArrayList<String>();
        ArrayList<Integer> nums=new ArrayList<Integer>();
        nums.add(23);
        nums.add(34);
        nums.add(123);
        nums.add(45);
        
        
        // nums.add(0,43);
        
        // Collections.sort(nums);
    //    int num = nums.get(3);
    //    nums.set(2,6000);
      
    //    nums.remove(2);
    //    nums.clear();
    int size = nums.size();
    
       for (int i = 0; i <size ; i++) {
               System.out.println(nums.get(i));
       }

        

    }
}
