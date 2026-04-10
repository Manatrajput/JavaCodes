import java.util.Scanner;
 public class Factorial { 
    public static void main(String[] args) {
        int factorial = 1;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number");

 System.out.println("n");
         int n = sc.nextInt();
        for (int i=1;i<=n;i++) {
factorial = factorial * i;

    
}
 System.out.println(factorial);
    }

 }
