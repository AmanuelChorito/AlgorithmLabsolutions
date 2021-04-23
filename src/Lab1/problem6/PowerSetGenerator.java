package Lab1.problem6;

import java.util.*;

public class PowerSetGenerator {
    public static List<Set<Integer>> powerSet(List<Integer> list) {
        List<Set<Integer>> wholeSet= new ArrayList<>() ;
          Set<Integer> subsetCreated = new HashSet<Integer>();
            subsetCreater(wholeSet,subsetCreated, list,0);
                return wholeSet;

//Given a List L without duplicate elements, return another list that consists of all
//subsets of L (without duplicates). Use the following method signature:

    }

    private static void subsetCreater(List<Set<Integer>> wholeSet, Set<Integer> subsetCreated, List<Integer> list, int start) {
        wholeSet.add(new HashSet<>(subsetCreated));
        for (int i=start;i<list.size();i++){
            subsetCreated.add(list.get(i));
            subsetCreater(wholeSet,subsetCreated,list,i+1);
            subsetCreated.remove(subsetCreated.size()-1);
        }
    }


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 9, 4, 8, 5));
        System.out.println( powerSet(list));
    }
}
