import java.util.*;
public class Hashing {

    public static void main(String[] args) {
               Scanner sc = new Scanner(System.in);
               int n;
               
               n=sc.nextInt();

               int[] arr = new int[n];
               for(int i=0;i<n;i++)
               {
                arr[i]=sc.nextInt();
               }
            
               HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();
               for(int i=0;i<n;i++)
               {
               int key = arr[i];
               int freq = 0;
               if(mp.containsKey(key)) 
               freq = mp.get(key);
               freq++;
               mp.put(key, freq); 
               }
   
               
               for (Map.Entry<Integer, Integer> it : mp.entrySet()) {
                System.out.println(it.getKey() + "->" + it.getValue());
            }
           
         
    }
}
