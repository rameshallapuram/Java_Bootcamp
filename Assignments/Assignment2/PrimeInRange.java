package Assignments.Assignment2;

import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        //taking input
        int a = sc.nextInt();
        System.out.print("Enter a number larger than previous number: ");
        int b = sc.nextInt();
        PrimeNum(a,b);
    }
    //function
    public static void PrimeNum(int a, int b) {
        int flag; //reference variable to check if i is prime or not
        for (int i = a; i <= b; i++) {
            if (i==1 || i==0)
                continue;
            flag = 1;
            //checking prime number
            for (int j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
                System.out.print(i + " ");
        }
    }
}
