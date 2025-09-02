package loops;

import java.util.Scanner;

public class OddEvenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sumEven = 0;
        int sumOdd = 0;

        System.out.print("Enter the number of integers to read: ");
        int n = sc.nextInt();

        int i = 1; // counter
        do {
            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();

            if (num % 2 == 0) {
                sumEven += num;
            } else {
                sumOdd += num;
            }

            i++; // increase counter
        } while (i <= n);

        System.out.println("Sum of even integers: " + sumEven);
        System.out.println("Sum of odd integers: " + sumOdd);

        sc.close();
    }
}
