package JAVA_Journey.arrays;

public class SumOfArrayElements {
    public static void main(String [] args){
        float []arr = {82.4f, 34.6f, 54.5f, 65.4f};
        float sum = 0;
        for(float element : arr){
            sum+=element;
        }
        System.out.println("Sum of the elements of array is : "+sum);
    }
}
