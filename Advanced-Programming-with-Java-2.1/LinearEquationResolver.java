
import static java.lang.System.in;
import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");

        try (Scanner sc = new Scanner(in)) {
            System.out.print("a: ");
            double a = sc.nextDouble();

            System.out.print("b: ");
            double b = sc.nextDouble();

            System.out.print("c: ");
            double c = sc.nextDouble();

            if (a != 0) {
                double answer = (c - b) / a;
                System.out.println("Equation pass with x = " + answer);
            }   else {
                if (b == c) {
                    System.out.println("The solution is all x!");
                }
                else {
                    System.out.println("No solution!");
                }
            }
        }
    }
}
