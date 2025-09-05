package arrays;

public class Solution {

    private int[] prefixSum;

    public Solution(int [] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i-1];
        }
        this.prefixSum = nums;
    }

    public int sumRange(int left, int right) {
        if(left==0) {
            return prefixSum[right];
        }
        return prefixSum[right] - prefixSum[left-1];
    }

    public static void main(String[] args) {
        int [] nums = {1,2,      4,3,5,3       ,4};
        Solution solution =  new Solution(nums);
        int sum = solution.sumRange(2,5);
        System.out.println(sum);
        System.out.println();
    }
}
