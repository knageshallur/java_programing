package programs;

public class BubbleSort {
    public static void main(String[] args) {
        int array[] = {2, 4, 5, 3, 1, 6};
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(array[i]>array[j]){
                    int t=array[i];
                    array[i]=array[j];
                    array[j]=t;
                }
            }
        }
        for (int j =0; j < array.length; j++) {
            System.out.println(array[j]);
        }

    }
}
