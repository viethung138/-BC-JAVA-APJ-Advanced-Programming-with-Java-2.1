class Circle {
    private double radius = 2.0;
    private String color = "red";

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(1);
        System.out.println("Hình tròn 1 - Bán kính: " + c1.getRadius() + ", Diện tích: " + c1.getArea());

        Circle c2 = new Circle(2);
        System.out.println("Hình tròn 2 - Bán kính: " + c2.getRadius() + ", Diện tích: " + c2.getArea());
    }
}
