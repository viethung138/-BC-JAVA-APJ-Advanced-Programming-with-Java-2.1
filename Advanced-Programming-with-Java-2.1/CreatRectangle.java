import java.util.Scanner;

public class CreatRectangle {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the width: ");
            double width = sc.nextDouble();
            System.out.print("Enter the height: ");
            double height = sc.nextDouble();
            System.out.println("Your Rectangle");
            Rectangle rectangle = new Rectangle(width, height);
            System.out.println(rectangle.display());
            System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeter(width, height));
            System.out.println("Area of the Rectangle: " + rectangle.getArea(width, height));
        }
    }

    public static class Rectangle {
        public double width;
        public double height;

        public Rectangle () {

        }

        public Rectangle (double width, double height) {
            this.width = width;
            this.height = height;
        }

        public double getArea(double width, double height) {
            return width * height;
        }

        public double getPerimeter(double width, double height) {
            return (width + height) * 2;
        }

        public String display() {
            return "Rectagle{width = " + width + ", height = " + height + "}";
        }

    }
}
