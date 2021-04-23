package Lab2.problem3;




public class MergeSortedArray {
   public static int[] merge(int[] arr1, int[] arr2){
    int arr1Length=arr1.length;
    int arr2Length=arr2.length;
    int[] s= new int[arr1Length+arr2Length];
    for(int i=0,j=0,k=0;j<s.length;){
        if(i<arr1Length && k<arr2Length){
              if(arr1[i]<arr2[k])
                s[j++]=arr1[i++];
                else
                s[j++]=arr2[k++];
             }
        if(i<arr1Length && k>=arr2Length){

            s[j++]=arr1[i++];

        }
        if(k<arr2Length && i>=arr1Length){

            s[j++]=arr2[k++];

        }
    }
    return s;
    }

    public static void main(String[] args) {

        int[] list= new int[]{1, 3, 4,5,7,8,9};
        int[] list2= new int[]{2,3,5,6,11,12,13,14};
        int[] result=  merge(list,list2);

        for (int i:result){
            System.out.print(" ,"+i);
        }

    }

}
