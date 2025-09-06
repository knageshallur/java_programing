package programs;

public class DuplicateNumbers {
    public static void main(String[] args) {

int a[]={1,4,6,8,3,2,9,4,7,8,9,};
for(int i=0 ;i<a.length; i++ ){
    for(int j=i+1 ;j<a.length; j++ ){
        if(a[i]==a[j]){
            System.out.println("duplicate number is: "+a[j]);
        }
    }

}
    }
}
