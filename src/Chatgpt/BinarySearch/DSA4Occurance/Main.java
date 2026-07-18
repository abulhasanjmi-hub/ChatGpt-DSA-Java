package Chatgpt.BinarySearch.DSA4Occurance;

public class Main {
    public static void main(String[] args){
int[] arr = {1,2,3,4,4,4,4,4,4,4,4,67};
int low =0, high = arr.length-1;
int target = 4;
int first =FirstOccurence(arr, low, high, target);
int last = LastOccurance(arr, low, high, target);
System.out.println("Total Occurance =  "+(last-first+1));
    }
public static int FirstOccurence(int[] arr, int low, int high, int target){
if(low>high)
    return -1;
else{
    int mid = low+(high-low)/2;
    if(target==arr[mid]){
        int left= FirstOccurence(arr, low, mid-1, target);
        if(left!=-1)
            return left;
        else return mid;
    }
    else if(target<arr[mid])
        return FirstOccurence(arr, low, mid-1, target);
    else
        return FirstOccurence(arr, mid+1, high, target);
}


}
public static int LastOccurance(int[] arr , int low, int high, int target){
    if(low>high)
        return -1;
    else{
        int mid= low+(high -low)/2;
        if(target==arr[mid]){
            int right = LastOccurance(arr, mid+1, high, target);
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
