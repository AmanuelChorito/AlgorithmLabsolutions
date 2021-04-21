package problem1;

import java.util.HashMap;

public class SumofDistinctImproved {
 public static boolean SumExists( int[] arr, int z){
     HashMap<Integer,Integer> hashMap= new HashMap();
     for (int i:arr)
     hashMap.put(z-i,1);
     for (int j=0;j< arr.length;++j){
         if(hashMap.containsKey(arr[j]) && arr[j]!=(z-arr[j])){
             return true;
         }
     }
     return false;
 }

}
