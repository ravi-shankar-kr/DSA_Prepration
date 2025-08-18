/* Q1: Given an array of marks of studentd of students, if the mark of any student is less than 35 prints its roll number. [roll number is here refers to the index of the array] */

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");

        int n = input.nextInt();

        int[] marks = new int[n]; // Declaration with size

        for(int i = 0; i< n; i++){
            System.out.print("Enter marks for student " + (i+1)+ ": ");
            marks[i] = input.nextInt();
        }

        System.out.println("Roll numbers of students with marks less than 35:");
        for(int i = 0; i < n; i++){
            if(marks[i] < 35){
                System.out.print( (i +1) + " ");
            }
        }
    }
}