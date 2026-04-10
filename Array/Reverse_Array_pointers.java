package JAVA_Journey.arrays;

public class Reverse_Array_pointers {
    public static void main(String[] args){
        int marks[]={1,2,3,4,5,6};
        int left =0;
        int right=marks.length-1;
        int temp;
        while(left<right){
            temp = marks[left];
            marks[left] = marks[right];
            marks[right] = temp;
            left++;
            right--;
        }
        System.out.print("Reversed Arrays :");
        for(int element : marks){
            System.out.print(" "+element);
        }
    }
}
