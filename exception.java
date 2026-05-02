public class exception {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.err.println("Error: " + "Division by 0 is not allowed");
            
        }
        finally {
            System.out.println("enter value>0");
            System.out.println("thank you");
        }
    }
}