import java.util.Scanner;

public class PrintNprimes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
     
        System.out.print("Enter the number of prime numbers to print: ");
        int n = scanner.nextInt();
        
        int count = 0; 
        int num = 2;   
        
        while (count < n) {
            int divisorCount = 0; 

            
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    divisorCount++; 
                }
            }

            
            if (divisorCount == 1) { 
                System.out.print(num + " "); 
                count++;
            }

            num++; 
        }
        
        scanner.close();
    }
}
