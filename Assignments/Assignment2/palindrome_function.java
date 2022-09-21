package Assignments.Assignment2;

import java.util.Scanner;

public class palindrome_function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string/character to check if it's palindrome or not: ");
        String UserChoice = sc.nextLine();
        String original = UserChoice.toLowerCase();
        String reverse = "";
        palindrome(original, reverse);
    }

    public static void palindrome(String a, String b) {
        for (int i = a.length() - 1; i >=0; --i) {
            b = b + (a.charAt(i));
        }
        if (a.equals(b)) {
            System.out.println("It's a palindrome");
        } else {
            System.out.println("It's not a palindrome");
        }
    }
}

