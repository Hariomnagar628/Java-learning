package Stringmethods;

public class Split {
       public static void main(String[] args) {
        String sentence = "I love java, java is good language" ;

            


        String newsentence[] = sentence.split(" ");
        String newsentence1[] = sentence.split(",");
        
       for(String word:newsentence)
       {
        System.out.print(word);
       }
       
       System.out.println();

       for(String word:newsentence1)
       {
        System.out.print(word);
       }


    }

}
