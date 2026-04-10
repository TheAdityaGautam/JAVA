package JAVA_Journey.arrays;

public class AverageOfElements {
    public static void main(String[]args){
        float [] arr={76.3f, 78.2f, 24.4f, 34.5f};
        float sum=0;

        for(float element : arr){
            sum+=element;
        }

        float avg = (sum/arr.length);
        System.out.println("The average of elements of the array is : "+avg);
    }
}
