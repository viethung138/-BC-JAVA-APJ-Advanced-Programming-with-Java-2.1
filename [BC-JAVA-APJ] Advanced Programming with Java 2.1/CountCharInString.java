import java.util.Scanner;

public class CountCharInString {
    public static int countOccurances(String str, char ch) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String myString = "Hoc lap trinh Java khong kho, chi can cham chi!";
        System.out.println("Chuỗi cho trước: \"" + myString + "\"");

        System.out.print("Nhập vào một ký tự cần đếm: ");
        char searchChar = sc.next().charAt(0);

        int result = countOccurances(myString, searchChar);

        System.out.println("Ký tự '" + searchChar + "' xuất hiện " + result + " lần trong chuỗi.");
        sc.close();
    }
}
