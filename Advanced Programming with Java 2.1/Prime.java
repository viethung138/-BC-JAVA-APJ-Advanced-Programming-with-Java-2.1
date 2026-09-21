import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            if (num <= 1) {
                System.out.print(num + " is not a prime");
            } else {
                boolean check = true;
                for (int i = 2; i <= num * 0.5; i++) {
                    if (num % i == 0) {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    System.out.print(num + " is a prime");
                } else {
                    System.out.print(num + " is not a prime");
                }
            }
        }
    }
}