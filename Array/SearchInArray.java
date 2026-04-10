package JAVA_Journey.arrays;
import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        float num = sc.nextFloat();

        float [] arr = {45.8f, 76.2f, 98.2f, 34.6f, 25.5f};
        boolean isinArray = false;

        for(float element : arr){
            if(num==element){
                isinArray=true;
                break;
            }
        }
        if(isinArray){
            System.out.println("The number "+num+" is PRESENT in the array.");
        }
        else{
            System.out.println("The number "+num+" is NOT PRESENT in the array.");
        }
    }
}
