package programs;

public class DuplicateWordsInString {
    public static void main(String[] args) {
        String s = "hi hello wolrd i am saying hi again to all wolrd";
        String s1[] = s.split(" ");
        System.out.println("Duplicate words is:");
        for (int i = 0; i < s1.length; i++) {
            for (int j = i + 1; j < s1.length; j++) {
                if (s1[i].equals(s1[j])) {
                    System.out.println(s1[j]);
                }

            }

        }
    }
}
