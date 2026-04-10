package Recursion;
import java.util.*;

public class Fibonacci {
    static int fib(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int a = sc.nextInt();
        System.out.print("Fibonacci Series is : ");
        for(int i=0; i<a; i++){
            System.out.print(" "+fib(i));
        }
    }
}
