import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void inputArray(int[] arr, Scanner sc, String arrayName) {
        System.out.println("--- Nhập dữ liệu cho " + arrayName + " ---");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập phần tử ở vị trí " + i + ": ");
            arr[i] = sc.nextInt();
        }
    }

    public static int[] mergeTwoArrays(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int len3 = len1 + len2;
        int[] arr3 = new int[len3];

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length + i] = arr2[i];
        }

        return arr3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập kích thước mảng 1: ");
        int size1 = sc.nextInt();
        int[] array1 = new int[size1];

        System.out.print("Nhập kích thước mảng 1: ");
        int size2 = sc.nextInt();
        int[] array2 = new int[size2];

        inputArray(array1, sc, "Mảng 1");
        System.out.println();
        inputArray(array2, sc, "Mảng 2");
        System.out.println();

        int[] array3 = mergeTwoArrays(array1, array2);

        System.out.println("Mảng 1 đã nhập: " + Arrays.toString(array1));
        System.out.println("Mảng 2 đã nhập: " + Arrays.toString(array2));
        System.out.println("Mảng 3 đã nhập: " + Arrays.toString(array3));

        sc.close();
    }
}
