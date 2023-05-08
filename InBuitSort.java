import java.util.Arrays;
import java.util.Collections;
public class DsaSorting4 {
    public static void printArr(Integer arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            
        }
    }
    public static void main(String args[]){
        Integer arr[]={3,2,5,1,6,8,4};
       // Arrays.sort(arr);
      // Arrays.sort(arr,Collections.reverseOrder(null));
       Arrays.sort(arr,3,6,Collections.reverseOrder(null));
       Arrays.sort(arr, 0, arr.length);
       
        printArr(arr);
    }
    

}
