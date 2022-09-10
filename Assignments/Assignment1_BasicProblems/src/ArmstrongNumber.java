import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int remainder;
        int pow = 0;
        double result = 0;
        int OgNum = num; //to prevent altering original value.

        while (OgNum != 0) { //this loop splits the number and gives digit count
            pow = pow + 1;
            OgNum /= 10;
        }
        OgNum = num;
        while (OgNum > 0) {
            remainder = OgNum % 10;
            result = result + Math.pow(remainder, pow);
            OgNum /= 10;
        }

        if (result == num) {
            System.out.println("It's an armstrong number");
        }
        else {
            System.out.println("It's not an armstrong number.");
        }

    }

}
