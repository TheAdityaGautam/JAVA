package OOPS;

class Person {
    int age;

    Person(int age) {
        this.age = age;
    }

    void show() {
        System.out.println(age);
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        Person p = new Person(20);
        p.show();
    }
}