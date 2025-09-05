package leetcode;

public class ArrayTargetSum {
    public static void main(String[] args) {
        int target = 7;
        int [] nums = {2,3,1,2,4,3};
        System.out.println(countSumTarget(target, nums));
    }

    public static int countSumTarget(int target, int [] nums) {
        int window = 0;
        int left = 0;
        int answer = Integer.MAX_VALUE;
        for(int right =0; right< nums.length; right++) {
            window += nums[right];
            while(window>=target) {
                answer = Math.min(answer, right-left+1);
                window -= nums[left++];
            }
        }
        return answer == Integer.MAX_VALUE ? 0 : answer;
    }
}
