/* Q3: Find the element 'X' in  the array. Take Array and X as input */

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50}; // Example array

        System.out.print("Enter the element to search: ");

        int x = input.nextInt();

        boolean flag = false; // nhi mila

        for(int i = 0; i <arr.length; i++){
            if (arr[i] == x){
                flag = true;  // mil gya
                break;
            }
        }
         if (flag == false ){
                System.out.println("Not found");
            }
            else {
                System.out.println("Found");
            }
    }
}