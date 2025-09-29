package functions;

import java.util.Scanner;

public class factorial {
    public static int factorial(int n){
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f*i;
        }
        return f;
    }

    public static void main(String[] args) {
        System.out.print("Enter a number you want to factorial: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("The factorial of your number is "+ factorial(n));
    }
}
