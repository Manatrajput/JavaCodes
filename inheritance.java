class vehicle {
    void run() {
        System.out.println("vehicle can run");
    }
    
}
class Car extends vehicle {
    void fuel() {
        System.out.println("car usres fuel");
    }
}
class Electric extends Car{
    void battery(){
        System.out.println("Electric uses battery");
    }
}
  public class inheritance {
public static void main(String[] args) {
    Electric e = new Electric();
    e.run();
    e.fuel();
    e.battery();
    
}

}




