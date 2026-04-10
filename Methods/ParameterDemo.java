package Methods;
import java.util.Scanner;

public class ParameterDemo {
    static void printName(String name){
        System.out.println("Hello and Welcome "+name+"!");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name = ");
        String name = sc.nextLine();
        printName(name);
        sc.close();
    }
}

