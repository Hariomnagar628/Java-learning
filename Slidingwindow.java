public class Slidingwindow {

    public static int maxSumSubarray(int[] arr, int k) {
        int maxSum = 0, windowSum = 0;

        // Calculate the sum of the first window of size k
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        // Set the maxSum to the current windowSum
        maxSum = windowSum;

        // Slide the window from the start to the end of the array
        for (int i = k; i < arr.length; i++) {
            // Slide the window: subtract the element going out, add the new element coming in
            windowSum += arr[i] - arr[i - k];
            
            // Update the maxSum if needed
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println("Maximum sum: " + maxSumSubarray(arr, k));
    }
}
