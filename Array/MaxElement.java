package JAVA_Journey.arrays;

public class MaxElement {
    public static void main(String [] args){
        int [] arr = {54,38,23,72,5,78,34};
        int max= Integer.MIN_VALUE;
        for(int element : arr){
            if(max < element){
                max=element;
            }
        }
        System.out.println("The maximum element of array is : "+max);
    }
}
