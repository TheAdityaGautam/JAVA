package Strings;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "banana";
        int count = 0;
        for(int i=0; i < str.length(); i++){
            count = 1;
            for(int j=i+1; j<str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    count ++;
                }
            }
            System.out.println(str.charAt(i)+" : "+count);
        }
    }
}
