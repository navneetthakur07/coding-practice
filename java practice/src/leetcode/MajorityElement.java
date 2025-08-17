package leetcode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
//        int[] ar = {3,2,3};
         int [] ar = {2,2,1,1,1,2,2};
        System.out.println(solution(ar));
    }

    public static int solution(int[] arrays){
        // we will use HashMap to store the elements and its count and will the element
        // which has the highest count among each element
        Map<Integer, Integer> map = new HashMap<>();
        for (int array: arrays){
            map.put(array, map.getOrDefault(array,0)+1);
        }
        int max = Integer.MIN_VALUE;
        int maxKey = 0;
        for (Map.Entry<Integer, Integer> entry: map.entrySet()){
            if (entry.getValue()>max){
                max = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        return maxKey;
    }
}
