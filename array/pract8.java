package array;
//7. Count how many elements are even and odd.
public class pract8 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int even=0;
        int odd=0;
        for (int i : arr) {
            if (i%2==0) {
                even++;
                
            }
            else{
                odd++;
            }
            
        }
        System.out.println(even);
        System.out.println(odd);
    }
    
}
