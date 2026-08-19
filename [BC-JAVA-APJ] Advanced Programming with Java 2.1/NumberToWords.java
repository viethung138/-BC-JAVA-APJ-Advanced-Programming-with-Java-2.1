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
            } else if (number < 20) {
                int ones = number % 10;
                System.out.println(readTeens(ones));
            } else if (number < 100) {
                System.out.println(readTwoDigits(number));
            } else {
                int hundreds = number / 100;
                int remainder = number % 100;

                String result = readOneDigit(hundreds) + " hundreds";

                if (remainder > 0) {
                    if (remainder < 10) {
                        result += " and " + readOneDigit(remainder);
                    } else if (remainder < 20) {
                        int ones = remainder % 10;
                        result += " and " + readTeens(ones);
                    } else {
                        result += " and " + readTwoDigits(remainder);
                    }
                }
                System.out.println(result);
            }
        }
    }

    public static String readOneDigit(int digit) {
        return switch (digit) {
            case 0 -> "zero";
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            case 4 -> "four";
            case 5 -> "five";
            case 6 -> "six";
            case 7 -> "seven";
            case 8 -> "eight";
            case 9 -> "nine";
            default -> "";
        };
    }

    public static String readTeens(int ones) {
        return switch (ones) {
            case 0 -> "ten";
            case 1 -> "eleven";
            case 2 -> "twelve";
            case 3 -> "thirteen";
            case 4 -> "fourteen";
            case 5 -> "fifthteen";
            case 6 -> "sixteen";
            case 7 -> "seventeen";
            case 8 -> "eighteen";
            case 9 -> "nineteen";
            default -> "";
        };
    }

    public static String readTwoDigits(int number) {
        int tens = number / 10;
        int ones = number % 10;

        String tensString = switch (tens) {
            case 2 -> "twenty";
            case 3 -> "thirty";
            case 4 -> "forty";
            case 5 -> "fifty";
            case 6 -> "sixty";
            case 7 -> "seventy";
            case 8 -> "eighty";
            case 9 -> "ninety";
            default -> "";
        };

        if (ones != 0) {
            return tensString + " " + readOneDigit(ones);
        } else {
            return tensString;
        }
    }
}
