public class ternaryOperators {
    public static void main(String[] args) {
        boolean largestNum = (5>4)? true:false;
        System.out.println(largestNum);

        int largest = (5>4)? 5:4;
        System.out.println(largest);

        String type = (5%2==0)? "even":"odd";
        System.out.println(type);
    }
}
