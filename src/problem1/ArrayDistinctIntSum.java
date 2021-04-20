package problem1;

public class ArrayDistinctIntSum {
    public static boolean sumFound(int[] arr, int z) {
        if (arr == null || arr.length < 2) {
            return false;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) return false;
                if (arr[i] + arr[j] == z) {
                    return checkDistinct(arr);

                }
            }

        }

        return false;
    }

    private static boolean checkDistinct(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j=i+1;j<arr.length;j++){
                if (arr[i] == arr[j])
                    return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println( sumFound(new int[]{1,4,2,3},5));
        System.out.println( sumFound(new int[]{3,3,4,7},6));
        System.out.println( sumFound(new int[]{1},2));
        System.out.println( sumFound(new int[]{3,5,4,7},6));
        System.out.println( sumFound(new int[]{3,5,4,7,3},7));
        System.out.println( sumFound(new int[]{3,5,4,7,6},9));
    }
}
