package Loops;

import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number you want multiplication table: ");
        int n = sc.nextInt();

        System.err.println("The multiplication table of "+n +"is:");

        for(int i=1; i<= 10; i++){
            System.err.println(i*n);
        }




    }
}
