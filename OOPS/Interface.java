package OOPS;

interface Animals {
    void eat();
}

class Cow implements Animals {
    public void eat() {
        System.out.println("Cow eats grass");
    }
}

public class Interface {
    public static void main(String[] args) {
        Cow c = new Cow();
        c.eat();
    }
}