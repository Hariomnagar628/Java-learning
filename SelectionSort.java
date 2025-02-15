import java.util.Scanner;

public class SelectionSort {

     public static void selectionSort(int size) {
          int[] arr = new int[size];
          Scanner input = new Scanner(System.in);
          System.out.println("Enter " + size + " elements:");
          
          for(int i = 0; i < size; i++) {
              arr[i] = input.nextInt();
          }
          
          // Selection Sort Algorithm
          for(int i = 0; i < arr.length - 1; i++) {
              int mini = i; 
              for(int j = i + 1; j < arr.length; j++) {
                  if(arr[j] < arr[mini]) {
                      mini = j;
                  }
              }
              int temp = arr[mini];
              arr[mini] = arr[i];
              arr[i] = temp;
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
