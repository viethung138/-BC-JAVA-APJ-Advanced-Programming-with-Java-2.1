import java.util.Arrays;

import Point2D_3D.Point2D;
import Point2D_3D.Point3D;

public class Test2D_3D {
    public static void main(String[] args) {
        System.out.println("--- Kiểm thử Point2D ---");

        Point2D point2d = new Point2D();
        System.out.println("Khởi tạo mặc định: " + point2d);

        Point2D point2d2 = new Point2D(2.5f, 3.5f);
        System.out.println("Khởi tạo có tham số: " + point2d2);

        point2d.setXY(5.0f, 6.0f);
        System.out.println("Sau khi dùng setXY: " + point2d);
        System.out.println("Mảng từ getXY(): " + Arrays.toString(point2d.getXY()));

        System.out.println("\n--- Kiểm thử Point3D ---");
        Point3D p3a = new Point3D();
        System.out.println("Khởi tạo mặc định: " + p3a); // Kì vọng: (0.0,0.0,0.0)
        
        Point3D p3b = new Point3D(1.0f, 2.0f, 3.0f);
        System.out.println("Khởi tạo có tham số: " + p3b); // Kì vọng: (1.0,2.0,3.0)
        
        p3b.setXYZ(7.5f, 8.5f, 9.5f);
        System.out.println("Sau khi dùng setXYZ: " + p3b);
        System.out.println("Mảng từ getXYZ(): " + Arrays.toString(p3b.getXYZ()));
    }
}
