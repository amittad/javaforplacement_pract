package array;

public class pract6 {
    public static void main(String[] args) {
        int arr[]={11,23,65,67,98,1,5};
        int max1=arr[0];
        int min1=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max1=arr[i];
            }
            else{
                min1=arr[i];
            }
            
        }
        System.out.println(min1+""+max1);
    }
    
}
