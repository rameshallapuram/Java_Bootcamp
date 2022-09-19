package Assignments.Assignment2;

import java.util.Scanner;

public class SumTill0 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 1; int sum = 0;
        while(i != 0) {
            System.out.println("Enter a number: ");
            i = in.nextInt();
            sum  += i;
            System.out.println(sum);
        }
    }
}
