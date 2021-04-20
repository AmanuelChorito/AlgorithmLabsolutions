package problem3;
import java.util.*;
import lab1.powerset.PowerSet;
public class SubsetSumBruteForce {
    public static boolean subsetSum(List<Integer> list, Integer z) {
        int checkSumBefore=0;
       for (Integer i:list){
           checkSumBefore+=i;
       }
            if(checkSumBefore<z) return false;
         List<Set<Integer>> P = PowerSet.powerSet(list);
       // System.out.println(P);
        for (Set<Integer> k:P){ int sum = 0;
            for (Integer i:k) sum=sum+ i;
            if (sum == z) return true; }return false;
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 9, 4, 8, 5));System.out.println( subsetSum(list,21));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 3, 9, 4, 8, 5));System.out.println( subsetSum(list2,22));
        List<Integer> list3 = new ArrayList<>(Arrays.asList(1, 3, 9, 4, 8, 5));System.out.println( subsetSum(list3,31));
        List<Integer> list4 = new ArrayList<>(Arrays.asList(1, 3, 9, 4, 8, 5));System.out.println( subsetSum(list4,0));
    }}
