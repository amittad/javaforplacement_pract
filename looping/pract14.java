package looping;

import java.util.Scanner;

//Check if a number is prime or not.
public class pract14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        boolean prime=true;
        if (num<=1) {
            prime=false;
            
        }else{
            for(int i=2;i<num;i++){
                if (num%i==0) {
                    prime=false;
                    break;

                    
                }
            }
        }
        if (prime) {
            System.out.println("number is prime");
            
        }else{
            System.out.println("not prime2");
        }

       
        
    }
    
}
