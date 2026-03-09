package array;

import java.util.Scanner;

//10. Take n elements and print only those greater than a given value k.
public class pract10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int k=sc.nextInt();
        int app[];
        int arr[]={11,34,2,5,6,78,30};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>k) {
                System.out.println(arr[i]);
                
            }
            
        }
    }
    
}
