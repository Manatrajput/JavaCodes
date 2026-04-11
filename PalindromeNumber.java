import java.util.Scanner;

public class PalindromeNumber {
   public PalindromeNumber() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter a number to check if it's a palindrome: ");
      int var2 = var1.nextInt();
      var1.close();
      int var3 = var2;

      int var4;
      for(var4 = 0; var2 != 0; var2 /= 10) {
         int var5 = var2 % 10;
         var4 = var4 * 10 + var5;
      }

      if (var3 == var4) {
         System.out.println(var3 + " is a palindrome number.");
      } else {
         System.out.println(var3 + " is not a palindrome number.");
      }

   }
}

