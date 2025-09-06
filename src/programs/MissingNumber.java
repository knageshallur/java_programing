package programs;

public class MissingNumber {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 9};
        int n = a.length + 1;
        int sum = n * (n + 1) / 2;
        for (int i = 0; i <= a.length - 1; i++) {
            sum = sum - a[i];
        }
        System.out.println("missing number in series is: " + sum);
    }
}
