package arrays;

import java.util.Arrays;

/*
Problem is to find the sum of the array between the given indices
[1,2,4,3,5,2,4] -> give me the sum of elements between index 2 and index 5 including both
 */
public class RangeSumQuery_303 {
    public static void main(String[] args) {
        int left = 2;
        int right = 5;
        int[] nums = {1,2,4,3,5,2,4};
        System.out.println(subArraySum(left, right, nums));

    }

    private static int subArraySum(int left, int right, int[] nums) {
        int [] prefixSum = new int[nums.length];
        for (int i=1; i < nums.length; i++) {
            prefixSum[i] = nums[i] +  nums[i-1];
        }
        System.out.println(Arrays.toString(prefixSum));
        return  prefixSum[right] + prefixSum[left];

    }

}
