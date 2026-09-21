import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        double delta = Math.pow(this.b, 2) - 4 * this.a * this.c;
        return delta;
    }

    public double getRoot1() {
        double r1 = (-this.b + Math.pow(this.getDiscriminant(), 0.5)) / (2 * this.a);
        return r1;
    }

    public double getRoot2() {
        double r2 = (-this.b - Math.pow(this.getDiscriminant(), 0.5)) / (2 * this.a);
        return r2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        double delta = equation.getDiscriminant();

        if (delta > 0) {
            System.out.println("The equation has two roots " + equation.getRoot1() + " and " + equation.getRoot2());
        } else if (delta == 0) {
            System.out.println("The equation has one root " + equation.getRoot1());
        } else {
            System.out.println("The equation has no real roots");
        }
        sc.close();
    }
}
