package Recursion;
import java.util.*;

public class Factorial {
    static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }
        return n*factorial(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a =sc.nextInt();
        int result = factorial(a);
        System.out.println("The factorial of "+a+" is : "+result);
    }
}
