package Assignments.Assignment2;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = in.nextInt();

        System.out.print("Enter a number: ");
        int b = in.nextInt();

        System.out.print("Enter a number: ");
        int c = in.nextInt();

        int largest = largest(a, b, c);
        System.out.println("The largest number is: "+ largest);

        int smallest = smallest(a,b,c);
        System.out.println("smallest number is: "+ smallest);

    }
    //function
    public static int largest(int a, int b, int c) {
        int max = a;
        if( b > max) {
            max = b;
        } if (c > max) {
            max = c;
        }
        return max;
    }
    //function
    public static int smallest(int a, int b, int c) {
        int min = a;
        if (b< min){
            min = b;
        }if (c < min) {
            min = c;
        }
        return min;
    }
}
