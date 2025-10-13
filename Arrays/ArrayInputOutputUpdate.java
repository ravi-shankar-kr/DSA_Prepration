package Arrays;

import java.util.Scanner;

public class ArrayInputOutputUpdate {
    public static void main(String[] args) {
        int marks[] = new int[50];

        //input
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();  //physics
        marks[1] = sc.nextInt();    // chemistry
        marks[2] = sc.nextInt();     // maths

        //output
        System.out.println("physics " + marks[0]);
        System.out.println("chemistry " + marks[1]);
        System.out.println("maths " + marks[2]);


        //update
        marks[0]  = 99;
        System.out.println("physics " + marks[0]);

        marks[1]  = marks[1] +5;
        System.out.println("chemistry " + marks[1]);
    }
}
