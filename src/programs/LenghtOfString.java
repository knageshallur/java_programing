package programs;

public class LenghtOfString {
    public static void main(String[] args) {
        String word="javaprogramings";
        int size=word.length();
        if(size%2==0){
            System.out.println("word size is "+size+" and its even");
        }else {
                System.out.println("word size is "+size+" and its odd");
        }

    }
}
