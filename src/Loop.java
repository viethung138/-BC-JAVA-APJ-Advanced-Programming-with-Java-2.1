public class Loop {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        System.out.println("numbers[0]: " + numbers[0]);
        System.out.println("numbers[1]: " + numbers[1]);
        System.out.println("numbers[2]: " + numbers[2]);
        System.out.println("numbers[3]: " + numbers[3]);
        System.out.println("numbers[4]: " + numbers[4]);

        System.out.println("------------");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "]: " + numbers[i]);
        }
    }
}
