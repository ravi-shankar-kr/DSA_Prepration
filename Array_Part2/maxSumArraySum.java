package Array_Part2;

public class maxSumArraySum{

    public static void printSubarrays(int numbers[] ) {
       

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++){         //print
                    System.out.print(numbers[k] + " ");     // print sub arrays

                    currSum += numbers[k];
                }
                System.out.println("current sum is: " + currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }

              
            }
             
            
        }
        System.out.println("maximum sum = " + maxSum);
        
    }
    

    public static void main(String[] args) {
        
        int numbers[] = {1, -2, 6, -1, 3};
        printSubarrays(numbers);
    }
}
