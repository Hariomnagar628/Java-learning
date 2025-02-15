import java.util.Scanner;
public class Add {
    public static void main(String[] args) {
     
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter the first line");
        int x = myobj.nextInt();
        System.out.println("Enter the Second number");
        int y = myobj.nextInt();
        int sum = x+y;  
        System.out.println("The Addition of two number is : " + sum);



    }   
}