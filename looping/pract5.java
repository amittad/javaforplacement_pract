package looping;

import java.util.Scanner;

//. Print the table of a given number (n × 1 to n × 10)
public class pract5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num*i);
        }
        
    }
    
}
