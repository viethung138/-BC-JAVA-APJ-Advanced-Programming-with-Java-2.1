import java.util.Scanner;
public class NumberArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        try(Scanner sc = new Scanner(System.in)) {
            do {
                System.out.print("Enter a size: ");
                size = sc.nextInt();
                if(size > 20 || size <= 0) {
                    System.out.println("The size must be between 1 and 20");
                }   
            } while (size > 20 || size <= 0);
            array = new int[size];
            int i = 0;
            while (i < array.length) {
                System.out.print("Enter element" + (i + 1) + " : ");
                array[i] = sc.nextInt();
                i++;
            }
            System.out.print("Property list: ");
            for(int j = 0; j < array.length; j++) {
                System.out.print(array[j] + "\t");
            }
            int max = 0;
            int index = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j] > max) {
                    max = array[j];
                    index = j + 1;
                }
            }
            System.out.println();
            System.out.print("The largest property value in the list is " + max + ", at position " + index);
        }
    }
}