package looping;

import java.util.Scanner;

///Check if a number is a palindrome.
public class pract9 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        int store=0;
        int b=num;
        int a=0;
        while (num>0) {
            a=num%10;
            store=store*10+a;
            num=num/10;
            
            
        }

        if(b==store){
            System.out.println("nuber is palindrome");
        }
        else{
            System.out.println("number  is not palindrome");
        }
    }
}
