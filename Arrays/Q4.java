/* Q4: Find the second largest element in the given Array. */

public class Q4 {

    public static void main(String[] args) {
        
        int[] arr = {10, 20, 30, 40, 50}; // Example array
        int firstMax = Integer.MIN_VALUE; // Initialize to smallest possible value
        int secondMax = Integer.MIN_VALUE; // Initialize to smallest possible value

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstMax) {
                secondMax = firstMax; // Update second largest
                firstMax = arr[i]; // Update largest
            } else if (arr[i] > secondMax && arr[i] != firstMax) {
                secondMax = arr[i]; // Update second largest if it's not equal to the largest
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("Second largest element: " + secondMax);
        }

    }
} 