package functions;

public class fcOverloadingDT {
    public static  int sum(int a, int b)  {
        return a+b;
    }

    public static  float sum(float a, float b)  {
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(sum(2, 8));
        System.out.println(sum(5, 8));
    }
 
}
