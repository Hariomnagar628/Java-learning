package Stringmethods;

public class Chararray {
 
    public static void main(String[] args) {
        
// tocharaarya()--> convert any string into chararray.



        String sentence = "java";

        char array[] = sentence.toCharArray();

        for(char i:array)
        {
            System.out.println(i);
        }
    }
}
