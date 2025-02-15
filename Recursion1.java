public class Recursion1 {
    
    public static void printGfg(int N) {
        
        if(N==0) 
        return;
        System.out.println("GFG");
        printGfg(N-1);
        
        
    }
    public static void main(String[] args) {
        printGfg(5);
    }
}
