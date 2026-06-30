package movezeroestoend;

public class Main {
    public static void main(String[] args){
        int[] arr = {1,2,0,0,0,0,3,3,3,56,78,22,0,1,1,1,0};
        int[] arr2 = new int[arr.length];
        int start =0;
        int end = arr.length-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                    arr2[end]=arr[i];
                   end--;
                }
                else{
                    arr2[start] = arr[i];
                    start++; 
                }

            }
        

for(int i=0;i<arr.length;i++){
    System.out.print(arr2[i]+"\t");
}
    }
}
