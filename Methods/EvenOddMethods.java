package Methods;
import java.util.*;

public class EvenOddMethods {
    static void evenodd(int n){
        if(n%2==0){
            System.out.println("The entered number is EVEN.");
        }
        else{
            System.out.println("The entered number is ODD.");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int a = sc.nextInt();
        evenodd(a);
        sc.close();
    }
}
