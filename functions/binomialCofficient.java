package functions;


public class binomialCofficient {
    
    public static int fact(int n){
        // if(n<=0){
            // System.out.println("The factorial of 0 is 1"); 
        // }
        int f = 1;
        for(int i=1; i<=n; i++ ){
            f = f*i;
        }
        return f;
    }


    public static int bincoeff(int n, int r){
        int fact_n = fact(n);
        int fact_r = fact(r);
        int fact_nmr = fact(n-r);

        int bincoeff = fact_n/(fact_r * fact_nmr);

        return bincoeff;
    }
    

    public static void main(String[] args) {
         
        System.out.println( bincoeff(5,2));

    }
}
