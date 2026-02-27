package looping;

import java.util.Scanner;

public class pract10 {
//. Find the sum of digits of a number. 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        int last=0;
        while (num>0) {
            last=num%10;
            sum+=last;
            num=num/10;
            
        }
        System.out.println(sum);

        
    }
}
