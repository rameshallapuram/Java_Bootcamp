import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter Principle amount: ");
        float Principle = in.nextFloat();

        System.out.print("Enter interest rate: ");
        float Rate = in.nextFloat();

        System.out.print("Enter time in years: ");
        int Time = in.nextInt();

        double SimpleInterest = (Principle * Rate * Time)/100;
        System.out.println("Simple Interest is: "+SimpleInterest);

    }
}
