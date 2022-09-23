package Assignments.Assignment2;

import java.util.Scanner;

public class FactorialFunc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number to find the factorial: ");
        int num = sc.nextInt();
        System.out.print(Factorial(num));
    }

    //method
    public static int Factorial(int num) {
        int result =1;
        for (int i = num; i>=1; i--) {
            result *= i;
        }
        return result;
    }
}
