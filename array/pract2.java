package array;

import java.util.Scanner;

public class pract2 {
     public static void main(String[] args) {
        System.out.println("input the range");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            int inp=sc.nextInt();
            arr[i]=inp;

        }
        for (int j =arr.length-1; j >0; j--) {

            System.out.println(arr[j]);
            
        }

    }
    
}
