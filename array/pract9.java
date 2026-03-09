package array;
//8. Find the index of the maximum element. 
public class pract9 {
    public static void main(String[] args) {
        int arr[]={1,22,4,67,34,98,76,0};
        int max=arr[0];
        int min=arr[0];
        int add=0;
        int addmin=0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>max) {
                max=arr[i];
                add=i;
                
            }
            if (arr[i]<min) {
                min=arr[i];
                addmin=i;
                
            }
            
        }
        System.out.println(add);
        System.out.println(addmin);
    }
    
}
