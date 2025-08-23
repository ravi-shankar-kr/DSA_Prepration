import java.util.Scanner;

public class maxNum {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in);
        System.out.println("Calculate the max of 3 Number");

        System.out.print("Enter num a: ");
        int a = input.nextInt();

        System.out.print("Enter num b: ");
        int b = input.nextInt();

        System.out.print("Enter num c: ");
        int c = input.nextInt();
        

        if (a > b){
            if (a>c) {
                System.out.println("The max of 3 num is: "+a);
            }else {
                System.out.println("The max of 3 num is: "+c);
            }
        }
        else if (b > c){
            System.out.println( "The max of 3 num is: "+b);
            }else {
                System.out.println("The max of 3 num is: "+c);
            }

            
        
    }
    
}
