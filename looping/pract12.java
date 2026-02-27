package looping;

import java.util.Scanner;

public class pract12 {
    public static void main(String[] args) {
        int add=0;
        Scanner sc =new Scanner(System.in );
        int num=sc.nextInt();
        int ba=num;
        for(int i=1;i<num;i++){
            if(ba%i==0){
                add+=i;
            }
        }
        if (add==ba) {
            System.out.println("this number is a perfect numer");
            
        }
        else{
            System.out.println("this number is not perfect nummer");
        }
    }
    
}
