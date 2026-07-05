import java.util.Scanner; 
public class GreatestCommonFactor {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System. in)) {
            System.out.println("Enter a:");
            int a = sc.nextInt();
            System.out.println("Enter b:");
            int b = sc.nextInt();
            a = Math.abs(a);
            b = Math.abs(b);
            if (a == 0 || b == 0) {
                System.out.println("No greatest common factor");
                return;
            }
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            System.out.println("Greatest common factor: " + a);
        }
    }
}
