package Chatgpt.Sorting.DSA4QuickSort;

public class Main {
    public static void main(String[] args) {
        int[] arr = {8,3,5,4,7,1,2};
        int left = 0;
        int right = arr.length -1;
        QuickSort(arr,left,right);
        for(int num:arr){
            System.out.print(num+"  ");
        }
    }
    public static void QuickSort(int[] arr, int left , int right){
        if(left<right){
            int pivoteindex = partition(arr,left,right);
            QuickSort(arr, left, pivoteindex-1);
            QuickSort(arr, pivoteindex+1, right);
        }
    }
    public static int partition(int[] arr, int left , int right){
        int pivote = arr[right];
        int i=left-1;
        for(int j=left;j<right;j++){
            if(arr[j]<pivote){
                i++;
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = pivote;
        arr[right] = temp;
        return i+1;
        }
}
