package DSA8;

public class BinarySearch {
    static void binarysearch(int[] arr, int target, int start , int end ){
        while(start<=end){
            if(arr[(start+end)/2]==target){
System.out.println("Found and index number is   "+(start+end)/2);
break;
            }
            else{
                if ((target>arr[(start+end)/2])) {
                    start = ((start +end)/2)+1;
                }
                else 
                    end = ((start+end)/2)-1;
            }
        }
    }
    public static void main(String[] args) {
        int[]  arr={2,4,5,6,7,8,9,29,45,55,89};
        int target = 2;
        int start = 0;
        int end = arr.length-1;
        binarysearch(arr, target,start,end); 
    }
}
