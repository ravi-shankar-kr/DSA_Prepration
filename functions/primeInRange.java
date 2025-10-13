package functions;

public class primeInRange {
    public static boolean  isPrime(int n){
        boolean isPrime =  true;
        
        if(n == 2){
            isPrime = true;
        }
        for(int i=2; i<= n-1; i++){
            if ( n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void primeInRanges(int n){
        
    }

    public static void main(String[] args) {
        // System.out.println("prime number in range between 2 to "+ prime(10));
    }
}
