package JAVA_Journey.arrays;

public class MinElement {
    public static void main(String[] args){
        int []arr={76,23,7,5,67,78,756,43,3,65,7554};
        int min = Integer.MAX_VALUE;
        for(int element : arr){
            if(min>element){
                min=element;
            }
        }
        System.out.println("The minimum element of the array is : "+min);
    }
}
