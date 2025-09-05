package leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyCountUsingMap {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,1,3,4,5,6,1,5,4,2,5,1);
        System.out.println(frequencyCounter(numbers));
    }

    public static Map<Integer, Integer> frequencyCounter(List<Integer> numbers) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int number : numbers) {
            map.put(number, map.getOrDefault(number,0)+1);
        }
        return map;
    }
}
