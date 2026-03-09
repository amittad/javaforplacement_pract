package array;
//. Count how many elements are positive, negative, or zero.
public class pract7 {
   public static void main(String[] args) {
     int arr[]={-1,12,45,-2,0,-3};
     int zero=0;
     int pos=0;
     int neg=0;
     for (int i : arr) {
          if (i>0) {
            pos++;
            
          }
          if (i<0) {
            neg++;
            
          }
          if (i==0) {
            zero++;
            
          }
        
     }
     System.out.println(neg);
      System.out.println(pos);
       System.out.println(zero);
    
    
   }
}
