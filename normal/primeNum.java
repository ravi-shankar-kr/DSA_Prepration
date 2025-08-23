import java.util.Scanner;

public class primeNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Find if number is prime");

        System.out.print("Enter a num: ");
        int num = input.nextInt();

        int div = 2;
        while (div < num) {
            if(num % div == 0){
                System.out.println(num + " is not a prime number.");
                return;
            }
            div++;
        }
        System.out.println(num + " is a prime number.");
    }
}
