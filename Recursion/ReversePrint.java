package Recursion;

public class ReversePrint {
    static void printReverse(int n){
        if(n == 1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printReverse(n - 1);
    }

    public static void main(String[] args){
        printReverse(5);
    }
}
