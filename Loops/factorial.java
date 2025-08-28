package Loops;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.print("Enter the number you want to factorial: ");
        int n = sc.nextInt();

        if(n <= 0 ){
            System.out.println("The factorial of " + n + " is: 1");
         
        }
        int fact = 1;
            for(int i= 1; i<= n; i++){
                fact = fact*i;

                
            }

        System.out.print("The factorial of " + n + " is: "+ fact);
        
        

    }
}
