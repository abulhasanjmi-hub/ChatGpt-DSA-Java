package DSA9;

public class PeakInMountainArray {
    public static int findpeak(int[] arr){
        int low = 1, high = arr.length-2;
        while(low<=high){
        int mid = (low+high)/2;
        if(arr[mid]<arr[mid+1]&&arr[mid]>arr[mid-1])
            low = mid+1;
        else if (arr[mid]>arr[mid+1]&&arr[mid]>arr[mid-1])
            return arr[mid];
        else 
            high = mid-1;
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10,12,7,5,4,3,2,1};
        System.out.println(findpeak(arr));
    }
}
