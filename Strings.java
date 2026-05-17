public class Strings{
    public static void main(String[] args) {
     String str = "hello";
     String str1 = new String("hello") ; 
    //  Strings Method 
    int length  = str.length();
    char val  = str1.charAt(1);
    // Substring
    String str1new  = str1.substring(0,2);
    // String Comparison
    boolean isEqual = str1.equals(str);
    boolean isEqualIgnoreCase= str1.equalsIgnoreCase("hello");
    }
}
