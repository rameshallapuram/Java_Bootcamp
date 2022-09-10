//To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a word: ");
        String input = sc.next();//input string from the user
        input = input.toLowerCase();
        String rev = ""; // initialising an empty string variable to store reverse string

        for (int i = input.length() - 1; i >= 0; --i) {
            rev = rev + (input.charAt(i));
        }
        if (input.equals(rev.toString())) {
            System.out.println("It's a palindrome.");
        } else {
            System.out.println("It's not a palindrome.");
        }
    }
}
