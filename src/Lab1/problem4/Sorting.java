package Lab1.problem4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Sorting {
    public static void sort(ArrayList<Integer> list){
//Note that sorting is to be done in-place; this means that the original input list is modified
//so that it becomes sorted.
    for (int i=0;i<list.size()-1;i++){

        for (int j=i+1;j<list.size();j++){
            int temp=0;
            if(list.get(i)>list.get(j)){
                temp=list.get(j);
                list.set(j,list.get(i));
                list.set(i,temp);

            }
        }
    }
    }
    public static void sort(LinkedList<Integer> list){
        for (int i=0;i<list.size()-1;i++){

            for (int j=i+1;j<list.size();j++){
                int temp=0;
                if(list.get(i)>list.get(j)){
                    temp=list.get(j);
                    list.set(j,list.get(i));
                    list.set(i,temp);

                }
            }
        }

    }


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 9, 4, 8, 5));
        sort(list);
        System.out.println(list.toString());

        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 3, 9, 4, 8, 5));
        sort(linkedList);
        System.out.println(linkedList.toString());


    }
}
