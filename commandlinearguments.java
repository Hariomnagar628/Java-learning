
public class commandlinearguments {
 
    
public static void main(String[] args) {
    
     
    int result=0;
    System.out.println("command line arguments");
      
    for(String str:args)
       {

        int arguments = Integer.parseInt(str);
         result += arguments;
         
       }


       System.out.println(result);

}

}