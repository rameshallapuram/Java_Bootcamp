import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String dpmnt =in.next();

        switch (empID) {
            case 1 -> System.out.println("Rams");
            case 2 -> System.out.println("Manfred");
            case 3 -> System.out.println("Muller");
            case 4 -> {
                System.out.println("Emp no 4");
                switch (dpmnt) {
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("Management dept");
                    default -> System.out.println("enter correct6 dept");
                }
            }
            default -> {
                System.out.println("enter valid ID");
            }
        }
        }
    }

