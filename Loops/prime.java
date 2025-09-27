import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for checking prime: ");

        int n = sc.nextInt();

        boolean isprime = true;

        if(n == 2){
            System.err.println("n is a prime number");
        }else{
             for(int i = 2; i <=Math.sqrt(n); i++){
            if(n%i == 0){
                isprime = false;
            }
            
        }

        if(isprime == true){
            System.out.println("n is prime number");
        }else
        {
            System.out.println("n is not prime number");
        }
        }
    }
}
