package programs;

public class meargingTwoArray {
    public static void main(String[] args) {

        int a[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int b[] = {9, 10, 11, 12, 13, 14, 15};

        int mergedArray[] = new int[a.length + b.length];

        int i = 0;
        for (i = 0; i < a.length; i++) {
            mergedArray[i] = a[i];
        }
        for (int j = 0; j < b.length; j++) {
            mergedArray[i] = b[j];
            i++;
        }

        for (int k = 0; k < mergedArray.length; k++) {
            System.out.println(mergedArray[k]);
        }

    }
}

