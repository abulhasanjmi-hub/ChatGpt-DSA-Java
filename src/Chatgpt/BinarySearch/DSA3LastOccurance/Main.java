package Chatgpt.BinarySearch.DSA3LastOccurance;

public class Main {
    public static void main(String[] args){
        int[] arr = {1,2,34,55,55,55,55,67};
        int low = 0, high = arr.length-1,target =55;
        System.out.print(LastOccurance(arr,low,high,target));
    }
    public static int LastOccurance(int[] arr ,int low, int high,int target){
        if(low>high)
            return -1;
        else{
            int mid=low+(high-low)/2;
            if(target ==arr[mid]){
              int  right = LastOccurance(arr, mid+1, high, target);
                if(right!=-1)
                    return right;
                else 
                    return mid;
            }
            else if(target<arr[mid])
                return LastOccurance(arr, low, mid-1, target);
                else
                return LastOccurance(arr, mid+1, high, target);
            
        }
        
    }
}
