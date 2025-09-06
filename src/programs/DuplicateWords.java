package programs;

public class DuplicateWords {
    public static void main(String[] args) {
        String s1[] = {"abc", "xyz", "bca", "text", "xyz"};
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

