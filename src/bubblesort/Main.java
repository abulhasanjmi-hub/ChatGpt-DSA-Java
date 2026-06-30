package bubblesort;

public class Main {
    public static void main(String[] args){
        int[] arr = {5,3,8,4,2,56,34,23,46546,3435,234,1,2,4,5,6,7,1,1,1};
boolean swapping = false;
for(int i =0;i<=arr.length-2;i++){
    for(int j=0;j<=arr.length-2-i;j++){
        if(arr[j]>arr[j+1]){
            int temp = arr[j+1];
            arr[j+1] = arr[j];
            arr[j]= temp;
            swapping = true;
        }
    }
    if(swapping==false)
        break;
}
for(int num:arr){
    System.out.print(num+" ");
}
    }
}
