/* Q5: Count the number of elements in the given array greater than a given number X. */
public class Q5 {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50}; // Example array
        int x = 25; // Example value for X
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                count++;
            }
        }

        System.out.println("Number of elements greater than " + x + ": " + count);  
    }
}