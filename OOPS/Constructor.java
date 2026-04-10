package OOPS;

class Car{
    String name;
    int price;

    Car(String name, int price){
        this.name = name;
        this.price = price;
    }

    void display(){
        System.out.println("Name of the car is : "+name+" and it's price is : "+price);
    }
}
public class Constructor {
    public static void main(String[] args) {
        Car c1 = new Car("BMW", 142000);
        c1.display();
    }
}
