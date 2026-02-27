package looping;

import java.util.Scanner;

public class pract12 {
    public static void main(String[] args) {
        int add=0;
        Scanner sc =new Scanner("System.in");
        int num=sc.nextInt();
        int ba=num;
        for(int i=1;i<num;i++){
            if(ba%num==0){
                add+=num;
            }
        }
        if (add==ba) {
            System.out.println("this number is a perfect numer");
            
        }
    }
    
}
