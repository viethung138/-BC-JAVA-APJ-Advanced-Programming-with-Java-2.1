
import java.util.Scanner;

public class DeleteElementInArray {
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        int len = arr.length;
        System.out.print("Mảng ban đầu là: ");
        printArray(arr);

        System.out.println();
        System.out.print("Nhập phần tử cần xóa: ");
        int x = sc.nextInt();


        int index_del = -1;

        for (int i = 0; i < len; i++) {
            if (arr[i] == x) {
                index_del = i;
                System.out.println("-> Đã tìm thấy " + x + " tại vị trí index: " + index_del);
                break;
            }
        }

        if (index_del != -1) {
            for (int i = index_del; i < len - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[len - 1] = 0;
            System.out.println("Xóa thành công!");
        } else {
            System.out.println("-> Phần tử ");
        }
        System.out.print("Mảng sau khi xử lý: ");
        printArray(arr);
        sc.close();
    }
}
