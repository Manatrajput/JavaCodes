class LivingBeing {
    void breathe() {
        System.out.println("all LivingBeing breathe");
    }
}
class Animal extends LivingBeing {
    void eat() {
        System.out.println("Animal eat food");
    }
}
class bird extends Animal {


    void flying() {
        System.out.println("all birds can fly");
    }
}
class parrot extends bird {
    void speak() {
        System.out.println("parrot can speak");
    }
}
public class animal {
    public static void main(String[] args) {
        parrot p = new parrot();
        p.breathe();
        p.eat();
        p.flying();
        p.speak();
    }
}


















































































