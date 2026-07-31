import java.util.Scanner;

public class DisplayRecTri {

    public static void main(String[] args) {
        int choice  = -1;
        try(Scanner sc = new Scanner(System.in)) {
            while(choice != 0) {
                System.out.println("1. Print the rectangle");
                System.out.println("2. Print the square triangle");
                System.out.println("3. Print the isosceles triangle");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                
            }
        }
    }
}
