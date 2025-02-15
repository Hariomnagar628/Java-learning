import java.util.HashSet;

public class Practice {

    public static void main(String[] args) {
         
     int [] array = {1,2,3,2,2,3,54};

     
     HashSet<Integer> set = new HashSet<>();
     boolean hasDuplicates = false;
     
      for(int num:array)
      {
        if(!set.add(num))
        {
          hasDuplicates=true;
          break;
        }
      }

      System.out.println(hasDuplicates);

  }
 
    
    
}
