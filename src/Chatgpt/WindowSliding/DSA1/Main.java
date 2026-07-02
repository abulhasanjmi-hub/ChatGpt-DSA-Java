package Chatgpt.WindowSliding.DSA1;

public class Main {
    public static void main(String[] args){
    int[] arr={1,2,3,4,5,6};
    int sum=0;
    int k=3;
    for(int i=0;i<k;i++){
        sum = sum+arr[i];
    }
    int windowsum = sum;
    int maxsum  = windowsum;
    for(int j=0;j<arr.length-k;j++){
        windowsum = windowsum -arr[j]+arr[j+k];
        maxsum = Math.max(maxsum, windowsum);
    }
    System.out.println(maxsum);



    }
}
