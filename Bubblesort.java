import java.util.Scanner;

public class Bubblesort {

     public static void selectionSort(int size) {
          int[] arr = new int[size];
          Scanner input = new Scanner(System.in);
          System.out.println("Enter " + size + " elements:");
          
          for(int i = 0; i < size; i++) {
              arr[i] = input.nextInt();
          }
          
          // Bubble Sort Algorithm
          for(int i = arr.length-1; i>=0; i--) { 
              for(int j = 0; j <= i-1; j++) {
                  if(arr[j] > arr[j+1]) { 
                     int temp = arr[j+1];
              arr[j+1] = arr[j];
              arr[j] = temp;        
                  }
              }
              
              
          }
       

          
        System.out.println("Sorted Array:");
          for(int i = 0; i < arr.length; i++) {
              System.out.print(arr[i] + " ");
          }
          
          input.close(); 
     }
     
     public static void main(String[] args) {
          System.out.println("Enter the size of the array:");
          Scanner input = new Scanner(System.in);
          int size = input.nextInt();
            selectionSort(size);
     }
}
