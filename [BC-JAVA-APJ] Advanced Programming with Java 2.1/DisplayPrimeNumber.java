import java.util.Scanner;

public class DisplayPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số lượng số nguyên tố cần in ra: ");
        int numbers = sc.nextInt();
        int count = 0;
        int N = 2;
        System.out.println(numbers + " Số nguyên tố đầu tiên là: ");
        while (count < numbers) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(N + " ");
                count++;
            }
            N++;
        }
        sc.close();
    }
}
