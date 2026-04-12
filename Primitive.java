import java.util.Scanner;
public class Primitive
 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the integer");
        int sum= sc.nextInt();
        System.out.println("enter the float number");
        float f = sc.nextFloat();
        System.out.println("enter the character");
          char ch = sc.next().charAt(0);
          System.out.println("enter true or false");
          boolean b = sc.nextBoolean();
          System.out.println("Intergers;" + sum );
          System.out.println("Float:"+ f);
          System.out.println("char;"+ ch);
          System.out.println("Boolean:"+ b);
    }
}
