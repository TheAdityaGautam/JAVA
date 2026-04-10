package OOPS;

class Parent {
    void show() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    void show1() {
        System.out.println("Child class");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
        c.show1();
    }
}