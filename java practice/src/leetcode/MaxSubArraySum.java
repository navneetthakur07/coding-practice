package leetcode;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] arrays = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(maxSubArray(arrays));
    }

    public static int maxSubArray(int[] arrays) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int array: arrays) {
            currentSum += array;
            if(currentSum>maxSum){
                maxSum=currentSum;
            }
            if(currentSum<0){
                maxSum=0;
            }
        }
        return maxSum;
    }
}
