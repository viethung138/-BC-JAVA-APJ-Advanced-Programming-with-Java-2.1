import java.util.Arrays;
import java.util.Scanner;

public class FindMinArray {
    public static int[] inputArray(int size, Scanner sc) {
        int[] arr = new int[size];
        System.out.println("--- Nhập các phẩn tử cho mảng ---");
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử của mảng: ");
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.println("Kích thước mảng phải lớn hơn 0!");
        } else {
            int[] myArray = inputArray(size, sc);
            System.out.println("Mảng bạn vừa nhập là: " + Arrays.toString(myArray));

            int myValue = findMin(myArray);

            System.out.println("Giá trị nhỏ nhất trong mảng là: " + myValue);
        }

        sc.close();
    }
}
