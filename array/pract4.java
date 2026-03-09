package array;
//3. Find the average of array elements. 
public class pract4 {
    public static void main(String[] args) {
        int arr[]={10,20,30,40};
        int add=0;
        for (int i : arr) {
            add+=i;
        }

        System.out.println("avarage of array is="+add/arr.length
        );
    }
    
}
