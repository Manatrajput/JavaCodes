class locker{
    private int pin =  1234;
    private boolean isOpen = false;
    public void openlocker(int enteredpin) {

        if (enteredpin == pin) {
            isOpen = true;
            System.out.println("locker opened");
        } else {
            System.out.println("wrong pin");
        }
    }
    
    public void checkstatus() {
        if (isOpen) {
            System.out.println("locker is open");
        } else {
            System.out.println("locker is closed");
        }
    }
}
public class Mannat{
    
    public static void main(String[] args) {
{
    locker A = new locker();
    A.checkstatus();
    A.openlocker(1111);
    A.openlocker(1234);
    A.checkstatus();
 }

}
}




