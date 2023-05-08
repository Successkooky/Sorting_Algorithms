public class DsaSorting1 {
    //Bubble Sort
    public static void bubbleSort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
                
            }
            
        }
    }
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print("["+arr[i]+"]"+" ");
            
        }
    }
    public static void main(String args[]){
        int arr[]={2,4,8,1,3,6,10,7};
        bubbleSort(arr);
        printArr(arr);
    }
}
    

