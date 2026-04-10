package JAVA_Journey.arrays;

public class Sort {
    public static void main(String[]args){
        float [] arr = {1,2,37,4,5,6};
        boolean isSorted = true;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                isSorted=false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The given array is SORTED.");
        }
        else{
            System.out.println("The given array is NOT SORTED.");
        }
    }
}
