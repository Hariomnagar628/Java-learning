import java.util.Scanner;

public class HCF {

    public static void gcd(int num1, int num2) {
        int gcd = 1;  

        for (int i = 1; i <= Math.min(num1, num2); i++) { 
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;  
            }
        }

        System.out.println("GCD is: " + gcd);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        gcd(num1, num2);
    }
}
