import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a rollno: ");
        int rollno = input.nextInt();
        System.out.println("your roll no is " + rollno);
    }
}
