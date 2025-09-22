package programs;

public class SecondLargestNumberINArray {
    public static void main(String[] args) {
        int array[]={1,4,6,88,9,5,55};
        int largest_no=1;
        int second_largest_no=1;
        for(int no: array){
            if(no>largest_no){
                second_largest_no=largest_no;
                largest_no=no;

            }else if(no>second_largest_no && no!=second_largest_no){
                second_largest_no=no;
            }

        }
        System.out.println("second largest value in the array is: "+second_largest_no);
    }
}
