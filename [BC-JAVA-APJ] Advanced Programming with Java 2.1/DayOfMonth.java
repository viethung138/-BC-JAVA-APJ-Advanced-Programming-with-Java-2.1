import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Which month that you want to count days? ");
            int month = sc.nextInt();

            String dayInMonth = switch (month) {
                case 2 -> "28 or 29";
                case 1, 3, 5, 7, 8, 10, 12 -> "31";
                case 4, 6, 9, 11 -> "30";
                default -> "";
            };
            if (!dayInMonth.equals("")) {
                System.out.print("The month " + month + " has " + dayInMonth + " days!");
            } else {
                System.out.print("Invalid input!");
            }
        }
    }
}