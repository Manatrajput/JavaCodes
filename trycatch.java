 public class trycatch {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 5;
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error occurred");
        } finally {
            System.out.println("Finally block runs always");
        }
    }
}
