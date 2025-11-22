package interview;

public class MaxSubArraySum {
    public static void main(String[] args) {

        int[] array = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(maxSubArraySum(array));
    }

    public static int maxSubArraySum(int [] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int num : nums) {
            currentSum += num;
            if(currentSum>maxSum) {
                maxSum = currentSum;
            }
            if(currentSum<0){
                currentSum = 0;
            }
        }
        return maxSum;
    }
}
