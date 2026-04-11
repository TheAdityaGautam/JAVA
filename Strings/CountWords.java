package Strings;

public class CountWords {
    public static void main(String[] args) {
        String str = "Aditya";
        int count = 0;
        for(int i=str.length()-1; i>=0; i--){
            count+=1;
        }
        System.out.println("Total number of words present in the given word is : "+count);
    }
}
