import java.util.Scanner;

public class TakingInput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Arrays size: ");

        int n = input.nextInt();

        int[] array = new int[n]; // Declaration with size

        // input
        for(int i = 0; i < n; i++){
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = input.nextInt();

             
        }

        // output 
        System.out.print("final array is : ");
         for(int i = 0; i < n; i++){
            
            System.out.print( array[i] + " ");
         } 

    }
}