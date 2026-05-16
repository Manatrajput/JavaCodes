abstract class Shape {

    abstract void area();

    void message() {
        System.out.println("Area Calculation");
    }
}

class Rectangle extends Shape {

    int length = 10;
    int breadth = 5;

    void area() {

        int result = length * breadth;

        System.out.println("Area of Rectangle = " + result);
    }

    public static void main(String args[]) {

        Rectangle r = new Rectangle();

        r.message();
        r.area();
    }
}