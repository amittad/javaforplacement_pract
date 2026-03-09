package array;

public class pract6 {
    public static void main(String[] args) {
        int arr[]={11,23,65,67,98,1,5};
        int max=arr[0];
        int min=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
            else{
                min=arr[i];
            }
            
        }
    }
    
}
