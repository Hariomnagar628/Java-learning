import java.util.*;

public class Countdigit {
    public static int count(int n) {
        int count1 = 0;
        int num = n;
        while (n > 0) {
            int lastDigit = n % 10;
            if (num%lastDigit == 0) {
                count1++;
            }
            n = n / 10;
        }
        return count1; 
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int result = count(size); 
        System.out.println("Number of zeroes: " + result); 
    }
}
