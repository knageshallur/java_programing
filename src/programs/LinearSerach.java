package programs;

import java.util.Scanner;

public class LinearSerach {
    public static void main(String[] args) {
        int a[]={1,2,4,5,7,8,9};
        System.out.println("enter value you want to search");
        Scanner sc=new Scanner(System.in);
        int itemeToSerach=sc.nextInt();
        int indexValue=0;
        boolean searchResulte=false;
        for (int i=0;i<a.length;i++){
            if(itemeToSerach==a[i]){
                searchResulte=true;
                indexValue=i;
                break;
            }

        }
        if(searchResulte) {
            System.out.println("given value at " + indexValue + " index");
        }else{
            System.out.println("given value not found in the array");
        }



        }

    }

