public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int num1 = 17;
        int num2 = 5;
        int num3 = num1++ % --num2;
        System.out.println(num3);
    }
}