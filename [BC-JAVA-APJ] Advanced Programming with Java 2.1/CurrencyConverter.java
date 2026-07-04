import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double rate = 23000.0;
            System.out.print("Enter the amount in USD: ");
            double usd = sc.nextDouble();
            double vnd = usd * rate;
            System.out.printf("The amount in VND: %.0f", vnd);
        }
    }
}
