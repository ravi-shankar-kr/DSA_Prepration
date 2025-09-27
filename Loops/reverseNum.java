import java.util.Scanner;

public class reverseNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to reverse : ");
        int n = input.nextInt();
        System.out.print("Reverse number is : ");

        while (n>0) {
            int lastDigit = n%10;
            n = n/10;
            System.out.print(lastDigit);
        } 
        System.out.println();
    }
}
