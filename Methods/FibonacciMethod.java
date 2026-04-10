package Methods;
import java.util.*;
public class FibonacciMethod {
    static void fibonacci(int n){
        int first =0, second =1;
        System.out.print(first+" "+second);
        for(int i=0; i<n; i++){
            int third = first + second;
            System.out.print(" "+third);
            first = second;
            second = third;
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int a = sc.nextInt();
        fibonacci(a);
        sc.close();
    }
}
