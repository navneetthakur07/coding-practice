package arrays;

import java.util.Scanner;

public class MaxConsecutiveOnesI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get the size of the array
        System.out.println("Enter the size of the array");
        int input =  sc.nextInt();

        // Create and populate the array
        int [] nums = new int[input];
        System.out.println("Enter " + input + " elements(0s and 1s)");
        for(int i=0; i<nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes (int [] nums) {
        int onesFound = 0;
        int maxOnesFound = 0;

        for(int num : nums) {
            if(num == 1) {
                onesFound++;
                maxOnesFound = Math.max(onesFound, maxOnesFound);
            } else {
                onesFound = 0;
            }
        }
        return maxOnesFound;
    }
}
