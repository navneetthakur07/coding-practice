package interview;

public class LargestOfThreeNumbers {

    public static void main(String[] args) {
        int[] arrays = {1,6,4,7,22,99,102};
        findLargestNumber(arrays);
    }

    private static void findLargestNumber(int[] arrays) {
        if(arrays.length<3) {
            System.out.println("Less than 3 values are not allowed");
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int i=0; i<arrays.length; i++) {
            int current = arrays[i];

            if(current>first) {
                third = second;
                second = first;
                first = current;
            } else if (current > second) {
                third = second;
                second = current;
            } else if(current > third) {
                third = current;
            }
        }
        System.out.println("The largest of three elements are: " + first + ", " + second + ", " + third);
    }
}
