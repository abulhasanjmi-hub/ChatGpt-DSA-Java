package Chatgpt.Sorting.DSA3InsertionSort;

public class Main {
    public static void main(String[] args) {
        int[] arr ={7,5,3,9,2};
        int j=-1;
        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            for(j=0;j<=i-1;j++){
                if(arr[j]>key){
                    arr[j+1]=arr[j];
                }
            }
            arr[j]=key;
        }
for(int num:arr){
    System.out.print(num+"\t");
}
    }
}
