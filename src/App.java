import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Giai phuong trinh bac 1: ax + b = 0");
            System.out.println("Nhap vao a: ");
            double a = sc.nextDouble();
            System.out.println("Nhap vao b: ");
            double b = sc.nextDouble();
            if(a == 0) {
                if (b == 0) {
                    System.out.println("Phuong trinh co vo so nghiem");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            } else {
                double x = -b / a;
                System.out.println("Phuong trinh co nghiem duy nhat: " + x);
            }
        }
    }
}