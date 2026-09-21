import java.util.Arrays;
import java.util.Scanner;

public class InsertElementInArray {
    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static boolean insertElement(int[] arr, int x, int index) {
        if (index <= -1 || index >= arr.length - 1) {
            return false;
        }

        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }

        arr[index] = x;

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        System.out.print("Mảng ban đầu: ");
        printArray(arr);

        System.out.print("Nhập phần tử cần chèn: ");
        int x = sc.nextInt();

        System.out.print("Nhập vào vị trí index cần chèn vào trong mảng: ");
        int index = sc.nextInt();

        boolean isInserted = insertElement(arr, x, index);

        if (isInserted) {
            System.out.print("Mảng sau khi chèn: ");
            printArray(arr);
        } else {
            System.out.println("Không chèn được phần tử vào mảng.");
        }
        sc.close();
    }
}
