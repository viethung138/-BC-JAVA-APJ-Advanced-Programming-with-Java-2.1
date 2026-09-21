import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your name:");
            String s = sc.nextLine();
            System.out.println("Hello: " + s);
        }
    }
}
