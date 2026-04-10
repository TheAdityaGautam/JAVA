package Recursion;
import java.util.*;
public class SumDigits {
    static int SumDigits(int n){
        if(n==0) return 0;
        return n%10+SumDigits(n/10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        int result = SumDigits(a);
        System.out.println("The sum of the digits of "+a+" is : "+result);
        sc.close();
    }
}
