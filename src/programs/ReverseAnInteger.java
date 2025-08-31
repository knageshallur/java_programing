package programs;

public class ReverseAnInteger {
    public static void main(String[] args) {
        int num=98709086;
        int reverse=0;
        int lastDigit;

        while(num!=0) {
            lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num = num / 10;
        }
        System.out.println("reverse of given number is: "+ reverse);
    }

}
