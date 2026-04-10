package Recursion;

public class Power {
    static int power(int x, int y){
        if(y==0){
            return 1;
        }
        return x*power(x, y-1);
    }

    public static void main(String[] args) {
        int result = power(2, 5);
        System.out.println("2 to the power 5 gives : "+result);
    }
}
