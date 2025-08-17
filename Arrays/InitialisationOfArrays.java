public class InitialisationOfArrays {
    public static void main(String[] args) {
        // Declaration and Initialization of Arrays
        int[] array1 = new int[5]; // Declaration with size
        int[] array2 = {1, 2, 3, 4, 5, 15, 20 }; // Declaration with values

        // Accessing Array Elements
        System.out.println("Array 1, Element 0: " + array1[0]);
        System.out.println("Array 2, Element 0: " + array2[0]);
        array2[3] = 10;
        System.out.println("updatig value of index 3 is: "+ array2[3]);

        System.out.println();

        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }
}