package programs;

public class LeaderProblem {
    public static void main(String[] args) {
        int a[]={16,17,4,3,5,2};
        int len=a.length;
        int maxNumber=a[len-1];
        System.out.println(maxNumber);

        for (int index=len-2; index>=0; index-- ){
            if(a[index]>maxNumber){
                maxNumber=a[index];
                System.out.println(maxNumber);
                }
            }
    }
}
