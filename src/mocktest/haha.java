package mocktest;
import java.util.HashMap;
import java.util.Map;
public class haha {
   public static void main(String[] args){
    int [] arr = {1,1,3,4,5,5,4,4,5,1};
    HashMap<Integer,Integer> map = new HashMap<>();
    int maxfreq=0;
    int answer =Integer.MIN_VALUE;

    for(int i=0;i<arr.length;i++){
        map.put(arr[i],map.getOrDefault(arr[i],0)+1);
    }
    for(Map.Entry<Integer,Integer> entry:map.entrySet()){
   int key= entry.getKey();
   int freq = entry.getValue();
   if(maxfreq<freq){
    maxfreq= freq;
answer = key;
   }
   else if(freq==maxfreq&&key>answer)
    answer = key;
    }
    System.out.println(answer);
   } 

}
