package looping;

import java.util.Scanner;

//Count the number of digits in a given number.
public class pract7 {
    public static void main(String[] args) {
        Scanner a =new Scanner(System.in);
        int n=a.nextInt();
        int count=0;
        while (n>0) {
            n=n/10;
            count++;
            
        }
        System.out.print(count);
        
    }
    
}
