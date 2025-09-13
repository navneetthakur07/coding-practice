package arrays;

/*
int arr[] = {2, 3, -8, 7, -1, 2, 3}; // find the maxSum of the subarray
This is also called Kadane's Algorithm
 */
public class MaxSumArray {
    public static void main(String[] args) {
        int[] nums= {2, 3, -8, 7, -1, 2, 3};
        System.out.println(subArraySum(nums));
    }

    public static int subArraySum(int nums[]) {
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
