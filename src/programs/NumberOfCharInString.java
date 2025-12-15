package programs;

public class NumberOfCharInString {
    public static void main(String[] args) {
        String s="helloo world";
        int count=0;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)!=' '){
                count=count+1;
            }

        }
        System.out.println("total number of letters in the string is: "+count);
    }
}
