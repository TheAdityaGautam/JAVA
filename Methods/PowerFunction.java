package Methods;
import java.util.*;

public class PowerFunction {
    static int power(int x, int y){
        int num=1;
        for(int i=0; i<y; i++){
            num*=x;
        }
        return num;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int a = sc.nextInt();
        System.out.print("Enter the power = ");
        int b= sc.nextInt();
        System.out.println(a+" to the power "+b+" is "+power(a, b));
    }
}
