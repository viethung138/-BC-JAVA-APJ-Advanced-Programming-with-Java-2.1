import java.util.Scanner;

public class StudentArray {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a name's student: ");
            String name = sc.nextLine();
            boolean isExist = false;
            for (int i = 0; i < students.length; i++) {
                if(students[i].equals(name)) {
                    System.out.println("Position of the students in the list " + students[i] + " is: " + i);
                    isExist = true;
                    break;
                }
            }
            if(!isExist){
                System.out.println("Not found " + name + " in the list.");
            }
        }
    }
}
