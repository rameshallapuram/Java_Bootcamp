//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = scn.nextInt();
        System.out.print("Enter another number: ");
        int b = scn.nextInt();

        System.out.println("Please choose an operator from the list below.");
        System.out.println("[+, -, *, /]");
        char s = scn.next().charAt(0);

        if (s == '+') {
            System.out.println(a + b);
        }
        else if (s == '-') {
            System.out.println(a-b);
        }
        else if (s == '*') {
            System.out.println(a * b);
        }
        else if (s == '/') {
            System.out.println(a/b);
        }
        else {
            System.out.println("Please enter the operator from the list.");
        }
    }
}
