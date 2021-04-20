package problem2;

public class SecondSmallestElement {

    public static int secondSmallest(int[] arr) {
        if(arr==null || arr.length < 2) {
            throw new IllegalArgumentException("Input array too small");
        }
        int first=Integer.MAX_VALUE, second=Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
              if(arr[i]<=first){
                   second=first;
                    first=arr[i];
                }
              if(arr[i]!=first&& arr[i]<second)
                second=arr[i];


       }

        return second;
    }

    public static void main(String[] args) {
        System.out.println( secondSmallest(new int[]{1,4,2,3}));
        System.out.println( secondSmallest(new int[]{3,3,4,7}));


        System.out.println( secondSmallest(new int[]{3,5,4,7}));
        System.out.println( secondSmallest(new int[]{3,5,4,7,3}));
        System.out.println( secondSmallest(new int[]{3,5,4,7,6}));

        System.out.println( secondSmallest(new int[]{9}));
    }

}
