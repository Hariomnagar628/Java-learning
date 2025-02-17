public class Reversed {
     public static void main(String[] args) {
        String reversstring = "";
        String name = "mynameisjava";
        for(int i=0;i<name.length();i++)
        {
            reversstring = name.charAt(i)+reversstring;
        }
        System.out.println(reversstring);
     }
    
}