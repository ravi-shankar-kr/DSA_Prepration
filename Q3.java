/* Q3: Find the maximum value out of all the elements in the array. */

public class Q3 {

    public static void main(String[] args) {
        int[] arr = {10, 20, 305, 40, 50}; // Example array
        int max = arr[0]; // Assume first element is max

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum value: " + max);
    }
}