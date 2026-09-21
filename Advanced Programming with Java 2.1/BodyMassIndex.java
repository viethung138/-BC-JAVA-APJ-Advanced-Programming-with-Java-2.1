import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Your weight (in kilogram): ");
            double weight = sc.nextDouble();
            System.out.print("Your height (in meter): ");
            double height = sc.nextDouble();
            double bmi = weight / (height * height);
            System.out.printf("%-20s%s", "bmi", "Interpretation\n");
            if (bmi < 18.5) {
                System.out.printf("%-20.2f%s", bmi, "Underweight");
            } else if (bmi < 25.0) {
                System.out.printf("%-20.2f%s", bmi, "Normal");
            } else if (bmi < 30) {
                System.out.printf("%-20.2f%s", bmi, "Overweight");
            } else {
                System.out.printf("%-20.2f%s", bmi, "Obese");
            }
        }
    }
}
