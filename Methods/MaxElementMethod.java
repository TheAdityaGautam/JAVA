package Methods;

public class MaxElementMethod {
    static int findmax(int [] arr){
        int max= Integer.MIN_VALUE;
        for(int element : arr){
            if(max<element){
                max = element;
            }
        }
        return max;
    }
    public static void main(String[]args){
        int [] arr= {54,34,45,57,67,89,49};
        System.out.println("The maximum element on the given array is : "+findmax(arr));
    }
}
