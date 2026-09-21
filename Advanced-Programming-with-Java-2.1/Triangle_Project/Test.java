package Triangle_Project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test {
    public static void main(String[] args) throws IOException {
        // Sử dụng BufferedReader để đọc dữ liệu tối ưu thay vì Scanner
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Gọi hàm xử lý độc lập
        processTriangleInput(br);
    }

    private static void processTriangleInput(BufferedReader br) throws IOException {
        // Nhập độ dài 3 cạnh
        System.out.print("Nhập độ dài 3 cạnh của tam giác (cách nhau bởi khoảng trắng): ");
        StringTokenizer st = new StringTokenizer(br.readLine());
        double side1 = Double.parseDouble(st.nextToken());
        double side2 = Double.parseDouble(st.nextToken());
        double side3 = Double.parseDouble(st.nextToken());

        // Nhập màu sắc
        System.out.print("Nhập màu sắc của tam giác: ");
        String color = br.readLine().trim();

        // Kiểm tra tính hợp lệ của tam giác
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            System.out.println("Lỗi: Ba cạnh nhập vào không tạo thành một tam giác hợp lệ.");
            return;
        }

        // Khởi tạo đối tượng Triangle và thiết lập màu sắc
        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);

        // Gom kết quả bằng StringBuilder trước khi in
        StringBuilder out = new StringBuilder();
        out.append("\n--- KẾT QUẢ ---\n");
        out.append("Màu sắc: ").append(triangle.getColor()).append("\n");
        out.append("Chu vi: ").append(String.format("%.2f", triangle.getPerimeter())).append("\n");
        out.append("Diện tích: ").append(String.format("%.2f", triangle.getArea())).append("\n");
        out.append("Chi tiết đối tượng: ").append(triangle.toString()).append("\n");

        // In kết quả một lần duy nhất
        System.out.print(out.toString());
    }
}
