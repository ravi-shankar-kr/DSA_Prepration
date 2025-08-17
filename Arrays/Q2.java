/* Q2: calculate the sum of all the elements in the given array. */

import java.util.Scanner;

public class Q2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements in array: ");
        int n = input.nextInt();

        int[] arr = new int[n]; // Declaration with size

        for(int i = 0; i < n; i++){
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = input.nextInt();
        }

        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
            
        }

        System.out.println("Sum of all elements: " + sum);
    }
}