package Strings;

public class RemoveSpaces {
    public static void main(String[] args) {
        String str = "Adit ya";
        String result = "";
        for(int i = 0; i < str.length(); i++){
            if (str.charAt(i) != ' ') {
                result += str.charAt(i);
            }
        }
        System.out.println("String without spaces is : "+result);
    }
}
