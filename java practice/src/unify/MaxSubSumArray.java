package unify;

public class MaxSubSumArray {
    public static void main(String[] args) {
        int [] nums = {5,4,-1,7,8};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int [] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int num  : nums) {
            currentSum += num;
            if(currentSum>maxSum){
                maxSum=currentSum;
            }
            if(currentSum<0){
                currentSum=0;
            }
        }
        return maxSum;
    }
}
