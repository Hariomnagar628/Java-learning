import java.util.HashMap;
public class Hashmap{
    public static void main(String[] args) {
        HashMap<String,Integer> color = new HashMap<String,Integer>();
        color.put("Yellow",4);
        color.put("Blue", 5);
        color.put("Red",9);
        color.put("Black",8);
        for(int i:color.values())
        {
           System.out.println(i);
        }


     }
}