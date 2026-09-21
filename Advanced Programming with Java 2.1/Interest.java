import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter investment amount:");
            double money = sc.nextDouble();
            System.out.println("Enter number of months:");
            int month = sc.nextInt();
            System.out.println("Enter annual interest rate in percentage:");
            double interestRate = sc.nextDouble();
            double totatlInterest = 0;
            for(int i = 0; i < month; i++) {
                totatlInterest += money * (interestRate / 100) / 12 * month;
            }
            System.out.print("Total of interest: " + totatlInterest);
        }
    }
}
