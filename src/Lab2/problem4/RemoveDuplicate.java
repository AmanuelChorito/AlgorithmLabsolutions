package Lab2.problem4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class RemoveDuplicate {
    public static List<Integer> removeDups(ArrayList<Integer> arr){
        HashMap<Integer,Integer> hashMap= new HashMap<Integer,Integer>();
        List<Integer>list= new ArrayList<>();
        for (int i=0;i<arr.size();i++){
            if(!hashMap.containsKey(arr.get(i))){
                list.add(arr.get(i));
                hashMap.put(arr.get(i),1);
            }

        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(removeDups(new ArrayList<>(Arrays.asList(1,2,2,3,3,3,4,5,6,7))).toString());
    }
}
