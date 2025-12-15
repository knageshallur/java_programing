package programs;

public class MoveAllZerosAtEnd {
    public static void main(String[] args) {
        int array[]={1,0,4,3,0,2};
        int current=0;
        int indexvalue=0;
        for (current=0; current<array.length;current++){
            if(array[current]!=0){
                int t=array[indexvalue];
                array[indexvalue]=array[current];
                array[current]=t;
                indexvalue++;
            }
        }
        for(int no:array ){
            System.out.println(no);
        }

    }
}
