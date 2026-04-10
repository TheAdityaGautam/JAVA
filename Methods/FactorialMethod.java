package Methods;
import java.util.*;

public class FactorialMethod {
    static int factorial(int n){
        int fact =1;
        for(int i=1; i<=n; i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int a = sc.nextInt();
        int  b = factorial(a);
        System.out.println("The factorial of "+a+" is : "+b);
        sc.close();
    }
}
