package Chatgpt.BinarySearch.DSA1NormalBinarySearch;

public class Main {
    public static void main(String[] args){
        int[] arr = {1,2,5,6,7,34,45,45,66,67};
int low = 0, high = arr.length-1;
int target =7;
   System.out.print( BinarySearch(arr, low, high,target));
}
public static int BinarySearch(int[] arr, int low, int high, int target){
if(low<=high){
    int mid = low+(high-low)/2;
if(arr[mid]==target)
    return mid;
    else if(target<arr[mid])
       return BinarySearch(arr, low, mid-1, target);
    else
      return  BinarySearch(arr, mid+1, high, target);
}
else 
    return -1;
}

}
