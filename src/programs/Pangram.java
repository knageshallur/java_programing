package programs;

import java.util.Locale;

public class Pangram {
    public static void main(String[] args) {
        String input="the quick brown fox jumps over the lazy dog";
        input=input.toLowerCase();
        boolean result=checkPagram(input);
        if (result){
            System.out.println("string is a pangram");
        }else{
            System.out.println("string is not pangram");
        }

    }

    private static boolean checkPagram(String input) {
        if (input.length() < 26) {
            return false;
        }
        for (char i = 'a'; i <= 'z'; i++) {
            if (input.indexOf(i) < 0) {
                return false;
            }
        }
        return true;
    }
}
