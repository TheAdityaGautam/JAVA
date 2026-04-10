package JAVA_Journey.arrays;

public class Array {
    public static void main(String[] args){
        int [] arr = {4,23,54,56,3};
        // Displaying length of the given array
        System.out.println("Length of array : "+arr.length);
        // Displaying element of the given array
        System.out.println("4th element of the given array : "+arr[3]);
        // Display the Array using for loop
        System.out.print("Array Elements(for loop) : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
        // Display the Array using for each loop
        System.out.print("Array Elements(for each loop) : ");
        for(int element : arr){
            System.out.print(" "+element);
        }
    }
}
