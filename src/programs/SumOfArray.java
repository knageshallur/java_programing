package programs;

public class SumOfArray {
    public static void main(String[] args) {
        String s="hello world";
        StringBuilder reversed = new StringBuilder();
        for(int i=s.length()-1 ; i>=0; i--){
        reversed.append(s.charAt(i));
    }
        System.out.println(reversed);
    }
}
