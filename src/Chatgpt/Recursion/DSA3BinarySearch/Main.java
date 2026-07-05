package Chatgpt.Recursion.DSA3BinarySearch;

public class Main {
public static void main(String[] args) {
    int [] arr = {1,2,3,4,15,34,56,67,89,90,123,345,567,788};
int start =0,end = arr.length-1,target =567;
System.out.println(findtarget(arr, start, end, target));
}   
public static int findtarget(int[] arr,int start,int end,int target){
int mid = start + (end - start) / 2;
if(start>end)
    return -1;
if(arr[mid]==target)
    return mid;
else if(target<arr[mid]){
end =mid-1;
 return findtarget(arr, start,end,target);
}
else {
    start = mid+1;
    return findtarget(arr, start,end,target);
}
} 
}
