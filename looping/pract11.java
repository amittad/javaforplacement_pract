package looping;

import java.util.Scanner;

public class pract11 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        int number=num;
        int store=0;
        int last=0;
        while (num>0) {
            last=num%10;
            store=store+(last*last*last);
            num=num/10;
            
        }
        if (store==number) {
            System.out.println("this number is armstrong");
            
        }
        else{
            System.out.println("this number is not armstrong");
        }


    }
    
}
