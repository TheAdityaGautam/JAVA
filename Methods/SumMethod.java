package Methods;
import java.util.Scanner;

public class SumMethod {
    static int sum(int x , int y){
        return x+y;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number = ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number = ");
        int b = sc.nextInt();
        int result = sum(a,b);
        System.out.println("Sum of given numbers = "+result);
        sc.close();
    }
}
