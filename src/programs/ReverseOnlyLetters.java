package programs;

public class ReverseOnlyLetters {
    public static void main(String[] args) {
        String s="1abcde4gegeorgir7htjk6s2";
        char inputArray[]=s.toCharArray();
        int left=0;
        int right=inputArray.length-1;
        while (left<right){
            if(!Character.isLetter(inputArray[left])){
                left++;
            } else if (!Character.isLetter(inputArray[right])) {
                right--;
            } else {
                char temp=inputArray[left];
                inputArray[left]= inputArray[right];
                inputArray[right]= temp;
                right--;
                left++;
            }
        }
        for (int i =0; i<inputArray.length;i++){
            System.out.print(inputArray[i]);
        }
    }


}
