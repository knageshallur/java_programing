package programs;

public class NumberOfwordsInString {
    public static void main(String[] args) {
        String s="hello java world";
        String s1[]=s.split(" ");
        int size= s1.length;
        System.out.println("total words in the string is: "+size);
    }
}
