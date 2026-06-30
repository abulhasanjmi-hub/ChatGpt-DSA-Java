package binarysearch;
//  I am just commenting so can check how git keeps tacking our commits
public class binarysearch {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int start = 0 ;
        int end = arr.length-1;
        int target=50;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] ==target){
                System.out.println("Target element found");
            break;
            }
            else {
                if(target <arr[mid])
                    end = mid-1;
                else 
                    start = mid+1;
            }

        }
        System.out.println("Target element not found");

    }
}
