import java.util.Arrays;

public class Twopointerapro {

    // Function to find two numbers that sum to the target
    public static int[] twoSum(int[] arr, int target) {
        // Two pointers
        int left = 0;             // Start pointer
        int right = arr.length - 1; // End pointer

        // Loop until the two pointers meet
        while (left < right) {
            int sum = arr[left] + arr[right];

            // If we find the sum equal to the target
            if (sum == target) {
                return new int[] {arr[left], arr[right]};
            }
            
            // If the sum is less than the target, move the left pointer to the right
            else if (sum < target) {
                left++;
            }
            
            // If the sum is greater than the target, move the right pointer to the left
            else {
                right--;
            }
        }

        // If no pair is found
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 11, 15};
        int target = 15;

        int[] result = twoSum(arr, target);
        if (result.length > 0) {
            System.out.println("Pair found: " + Arrays.toString(result));
        } else {
            System.out.println("No pair found");
        }
    }
}
