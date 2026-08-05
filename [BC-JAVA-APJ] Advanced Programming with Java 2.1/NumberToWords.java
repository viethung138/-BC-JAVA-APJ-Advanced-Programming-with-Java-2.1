
import java.util.Scanner;

public class NumberToWords {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a non-negative integer (up to 3 digits): ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input!");
                return;
            }

            int number = sc.nextInt();

            if (number < 0 || number >= 1000) {
                System.out.println("out of ability");
                return;
            }

            if (number < 10) {
                System.out.println(readOneDigit(number));
            }
            else if (number < 20) {
                int ones = number % 10;
                System.out.println(readTeens(ones));
            }
            else if (number < 100) {
                System.out.println(readTwoDigits(number));
            }
            else {
                int hundreds = number / 100;
                int remainder = number % 100;

                String result = readOneDigit(hundreds) + " hundreds";

                if (remainder > 0) {
                    if (remainder < 10) {
                        result += " and " + readOneDigit(remainder);
                    }
                    else if (remainder < 20) {
                        int ones = remainder % 10;
                        result += " and " + readTeens(ones);
                    }
                    else {
                        result += " and " + readTwoDigits(remainder);
                    }
                }
                System.out.println(result);
            }
        }
    }

    public static String readOneDigit(int digit) {
        switch(digit) {
            case 0: return "zero";
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
            default: return "";
        }
    }

    public static String readTeens(int ones) {
        switch(ones) {
            case 0: return "ten";
            case 1: return "eleven";
            case 2: return "twelve";
            case 3: return "thirteen";
            case 4: return "fourteen";
            case 5: return "fifthteen";
            case 6: return "sixteen";
            case 7: return "seventeen";
            case 8: return "eighteen";
            case 9: return "nineteen";
            default: return "";
        }
    }

    public static String readTwoDigits(int number) {
        int tens = number / 10;
        int ones = number % 10;

        String tensString = "";

        switch(tens) {
            case 2: tensString = "twenty"; break;
            case 3: tensString = "thirty"; break;
            case 4: tensString = "fourty"; break;
            case 5: tensString = "fifty"; break;
            case 6: tensString = "sixty"; break;
            case 7: tensString = "seventy"; break;
            case 8: tensString = "eighty"; break;
            case 9: tensString = "ninety"; break;
        }

        if (ones != 0) {
            return tensString + " "  + readOneDigit(ones);
        } else {
            return tensString;
        }
    }
}
