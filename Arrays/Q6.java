/* Q6: write a program to reverse the array without using any extra array. */

public class Q6 {

    public static void  print(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {100, 27, 304, 450, 50, 78, 6, 8, 67, 80}; // Example array
        print(arr);

        int n = arr.length;
        int i = 0, j = n-1;

        while (i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        print(arr);
    }
}