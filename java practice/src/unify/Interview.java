package unify;

public class Interview {
    public static void main(String[] args) {
        int n = 7;
        int arr[] = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(maxSumSubArray(arr));
    }
    /*
    arr[] = [-2, -4]
    arr[] = [5, 4, 1, 7, 8] = maxSumSubArray
     */
    // write the subarray with the maximum sum
    public static int maxSumSubArray(int arr[]) {
        int maxSoFar = Integer.MIN_VALUE;
        int maxEndingHere = 0;

        for (int i = 0; i < arr.length; i++) {
            maxEndingHere += arr[i];
            if (maxSoFar < maxEndingHere) {
                maxSoFar = maxEndingHere;
            }
            if (maxEndingHere < 0) {
                maxEndingHere = 0;
            }
        }
        return maxSoFar;
    }


}
