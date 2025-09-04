package programs;

public class PrimeNumber {
    public static void main(String[] args) {
        int number = 17;
        int count = 0;
        for(int i=1 ; i<=number; i++){

            if(number%i == 0){
                count = count+1;
            }
        }
        if(count==2){
            System.out.println("given number is prime number");
        }
        else {
            System.out.println("given number is not a prime number");
        }
    }
}
