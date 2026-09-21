import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a year:");
            int year = sc.nextInt();
            boolean isLeapYear = false;
            boolean isDivisibleBy4 = year % 4 == 0;
            if (isDivisibleBy4) {
                boolean isDivisibleBy100 = year % 100 == 0;
                if (isDivisibleBy100) {
                    boolean isDivisibleBy400 = year % 400 == 0;
                    if (isDivisibleBy400) {
                        isLeapYear = true;
                    }
                } else {
                    isLeapYear = true;
                }
            }
            if (isLeapYear) {
                System.out.println(year + " is a leap year");
            } else {
                System.out.println(year + " is not a leap year");
            }
        }
    }
}
