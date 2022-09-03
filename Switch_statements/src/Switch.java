import java.util.Objects;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        int day = in.nextInt();


        switch (fruit) { //older switch case
            case "Mango":
                System.out.println("Favourite summer fruit");
                break;
            case "Apple":
                System.out.println("An apple a day keeps the doctor away.");
                break;
            case "orange":
                System.out.println("Vitamin C rich fruit.");
                break;
            default:
                System.out.println("Please enter a valid fruit.");
                break;
        }

        switch (day) { //enhanced switch case
            case 1, 2, 3, 4, 5 -> System.out.println("Weekdays");
            case 6, 7 -> System.out.println("weekends");
        }


    }
}
