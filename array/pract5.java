package array;
//4. Find the maximum element in an array. 

public class pract5 {
    public static void main(String[] args) {
        int arr[]={65,34,2,1,67,34};
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
            
        }
        System.out.println("maximum number in array is:="+max);
    }
    
}
