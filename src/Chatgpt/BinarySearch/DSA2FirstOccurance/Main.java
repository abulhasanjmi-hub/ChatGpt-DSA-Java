package Chatgpt.BinarySearch.DSA2FirstOccurance;

public class Main {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,55,55,55,55,78,78,78,78};
        int target  =78;
     int result =FirstOccurance(arr, 0, arr.length-1,target);
System.out.print("First Occurance" +" "+result);
    }
    public static int FirstOccurance(int[] arr,int low, int high, int target){
     if(low>high)
        return -1;
    else{   
int mid= low+(high-low)/2;
if(arr[mid]==target){
int left=-1;
 left=FirstOccurance(arr, low, mid-1, target);
if(left!=-1)
    return left;
else
    return mid;
}
else if(target<arr[mid]){
    return FirstOccurance(arr, low, mid-1, target);
}
    else
        return FirstOccurance(arr, mid+1, high, target);
}

}
}