package Chatgpt.Sorting.DSA4MergeSort;

public class Main {
    public static void main(String[] args){
        int left=0;
        int arr[] = {1,2,3,44,23,12,12,12,12,12,1,1,1,1,1,1,1,1};
        int right = arr.length-1;
        MergeSort(arr,left, right);
        for(int num:arr){
            System.out.print(num+" ");
        }

    }
public static void MergeSort(int arr[], int left, int right){
    if(left>=right){
        return;
    }
    int mid = left +(right-left)/2;
    MergeSort(arr,left,mid);
    MergeSort(arr, mid+1, right);
    Merge(arr,left,mid,right);
}
public static void Merge(int[] arr,int left,int mid,int right){
int n1=mid-left+1;
int n2=right-mid;
 int[] L = new int[n1];
int[] R = new int[n2];
int i=0;
int j=0;
int k=left;
for(;i<n1;i++){
    L[i]=arr[left+i];
    }
    for(;j<n2;j++){
        R[j]=arr[mid+j+1];
    }
    i=0;
    j=0;
    while(i<n1&&j<n2){
        if(L[i]<=R[j]){
            arr[k]=L[i];
            i++;
            k++;
        }
        else {
            arr[k]=R[j];
            j++;
            k++;
        }
    }
        while(i<n1){
            arr[k]=L[i];
            i++;
            k++;
    
        }
        while(j<n2){
            arr[k]=R[j];
            j++;
            k++;
        }
    
    }
}

