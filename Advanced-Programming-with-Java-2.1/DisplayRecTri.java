import java.util.Scanner;

public class DisplayRecTri {

    public static void main(String[] args) {
        int choice = -1;
        try (Scanner sc = new Scanner(System.in)) {
            while (choice != 0 && choice != 4) {
                System.out.println("Menu:");
                System.out.println("1. Print the rectangle");
                System.out.println("2. Print the square triangle");
                System.out.println("3. Print the isosceles triangle");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1 -> {
                        System.out.println("Print the rectangle:");
                        for (int i = 1; i <= 3; i++) {
                            for (int j = 1; j <= 7; j++) {
                                System.out.print("* ");
                            }
                            System.out.println();
                        }
                    }
                    case 2 -> {
                        System.out.println("Print the square triangle:");
                        System.out.println("a. Bottom-left:");
                        for (int i = 1; i <= 5; i++) {
                            for (int j = 1; j <= i; j++) {
                                System.out.print("* ");
                            }
                            System.out.println();
                        }

                        System.out.println("b. Top-left:");
                        for (int i = 5; i >= 1; i--) {
                            for (int j = 1; j <= i; j++) {
                                System.out.print("* ");
                            }
                            System.out.println();
                        }

                        System.out.println("c. Bottom-right:");
                        for (int i = 1; i <= 5; i++) {
                            for (int j = 1; j <= 5 - i; j++) {
                                System.out.print("  ");
                            }
                            for (int k = 1; k <= i; k++) {
                                System.out.print("* ");
                            }
                            System.out.println();
                        }

                        System.out.println("d. Top-right:");
                        for (int i = 5; i >= 1; i--) {
                            for (int j = 1; j <= 5 - i; j++) {
                                System.out.print("  ");
                            }
                            for (int k = 1; k <= 5 - i; k++) {
                                System.out.print("* ");
                            }
                            System.out.println();
                        }
                    }
                    case 0 -> System.out.println("Exiting program...");
                    default -> System.out.println("No choice");
                }
            }
        }
    }
}
