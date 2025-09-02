package programs;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "      hello      world     ";
        s.trim();// trim will remove starting and ending spaces
        char inputArray[] = s.toCharArray();
        int count = 0;
        for (int i = inputArray.length - 1; i >= 0; i--) {
            if (inputArray[i] != ' ') {
                count = count + 1;
            } else {
                if (count > 0) {
                    System.out.print("last word lenght is: " + count);
                    break;
                }
            }
        }

    }

}

