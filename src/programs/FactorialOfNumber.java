package programs;

import java.math.BigInteger;

public class FactorialOfNumber {
    public static void main(String[] args) {
        int factorial_no=15;
        int result=1;
        for(int i=1;i<=factorial_no; i++){
            result=result*i;
        }
        System.out.println("Factorial of "+factorial_no+" is:"+ result);
    }

    //find the factorial of big number(to store big integer value we used BigInteger data type)
//    public static void main(String[] args) {
//        int factorial_no=50;
//        BigInteger result=BigInteger.ONE;
//        for(int i=1;i<=factorial_no; i++){
//            result=result.multiply(BigInteger.valueOf(i));
//        }
//        System.out.println("Factorial of "+factorial_no+" is:"+ result);
//    }
}
