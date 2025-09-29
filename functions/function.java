
package functions;

import java.util.Scanner;

public class function {

    public static void printHello(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");

        return;
    }



    public static void calculateSum(int num1, int num2){
        int sum = num1 + num2;
        System.out.println("Sum is "+ sum);
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        calculateSum(num1, num2);
        printHello();

        
    }
}
