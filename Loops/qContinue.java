package Loops;

import java.util.Scanner;


public class qContinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter your number: ");
            int n = sc.nextInt();

            if(n%10 == 0){
                continue;
            }
            System.out.print("Your number is: "+ n);
        }while(true);
    }
}
