package Strings;

public class CountVowels {
    public static void main(String[] args) {
        String str = "Gautam";
        int count=0;
        for(int i=str.length()-1; i>=0; i--){
            char ch = str.charAt(i);
            if(ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E'|| ch=='I' || ch=='O' || ch=='U'){
                count+=1;
            }
        }
        System.out.println("Number of vowels present in the given String are : "+count);
    }
}
