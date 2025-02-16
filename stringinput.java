import java.util.Scanner;

public class stringinput {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String name = input.nextLine();

        String newname = input.next();

        System.out.println(newname);
        System.out.println(name);
    }
}
