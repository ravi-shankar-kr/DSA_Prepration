import java.util.Scanner;

public class sumNaturalNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number you want to sum: ");
        int n = input.nextInt();

        
        int sum = 0;
        for(int i = 1; i<= n; i++){
            sum += i;
            
            
        }
        System.out.println("The sum of natural number is : "+sum);
    }  

         
}
