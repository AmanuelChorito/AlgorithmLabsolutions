package Lab1.problem5;

public class Searching {
    public static boolean find(int[] arr, int z) {
//implement

        for(int i:arr){
            if(i==z)
                return true;

        }
        return false;
    }
//Question B:
// if the array is sorted the amount of element to be inspected will be decrease by half
// with this in mind the time complexity will be reduced

    public static void main(String[] args) {
        System.out.println( find(new int[]{2, 8, 3, 4},3));
        System.out.println( find(new int[]{2, 8, 3, 4},5));
        System.out.println( find(new int[]{2, 3, 4, 8},3));
        System.out.println( find(new int[]{2, 3, 4, 8},5));
    }
}
