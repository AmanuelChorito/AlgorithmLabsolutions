    package Lab1.problem2;

    public class SecondSmallestElement {

        public static int secondSmallest(int[] arr) {
            if(arr==null || arr.length < 2) {
                throw new IllegalArgumentException("Input array too small");
            }
            int first=Integer.MAX_VALUE, second=Integer.MAX_VALUE;
            for (int j : arr) {
                if (j <= first) {
                    second = first;
                    first = j;
                }
                if (j > first && j < second)
                    second = j;


            }



            return second;
        }

        public static void main(String[] args) {
            System.out.println( secondSmallest(new int[]{1,4,2,3}));
            System.out.println( secondSmallest(new int[]{3,3,4,7}));


            System.out.println( secondSmallest(new int[]{3,5,4,7,0}));
            System.out.println( secondSmallest(new int[]{3,5,4,7,3}));
            System.out.println( secondSmallest(new int[]{3,5,4,7,6}));

            System.out.println( secondSmallest(new int[]{9}));
        }

    }
