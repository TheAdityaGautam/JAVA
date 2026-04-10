package Methods;
import java.util.*;

public class PrimeCheck {
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i =2; i<n; i++){
            if(n%i ==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is prime or not : ");
        int a = sc.nextInt();
        isPrime(a);
        if(isPrime(a) == false){
            System.out.println("The entered number is NOT PRIME.");
        }
        else{
            System.out.println("The entered number is PRIME.");
        }
        sc.close();
    }
}
