import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        int[] a = {4, 2, 5, 6, 1, 7};
        int[] result = bubble(a);
        System.out.println(Arrays.toString(result));
    }

    public static int[] bubble(int[] arr) {
        int n = arr.length;
        int count = 0;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            count++;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            System.out.println("Count: " + count);
            System.out.println(Arrays.toString(arr));
            if (!swapped) {
                break;
            }
        }
        return arr;
    }
}
