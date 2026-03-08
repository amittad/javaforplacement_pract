package array;
//. Input n and take n integers into an array; print them.

import java.util.Scanner;

public class pract1 {
    public static void main(String[] args) {
        System.out.println("input the range");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            int inp=sc.nextInt();
            arr[i]=inp;

        }
        for(int arr1:arr){
            System.out.println(arr1);
        }

    }
    
}
