import java.util.Scanner;

public class sumOfN_naturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while(i<=n){
            sum += i;
            i++;
        }
        System.out.println("sum of first "+n+" natural numbers is: "+sum);
    }
}
