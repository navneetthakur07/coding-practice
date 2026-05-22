package arivihan;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindSingleElement {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,1,2,2,3,4,4);
        // Task is to find the unique element from the list
        Map<Integer, Integer> map = new HashMap<>();
        for(Integer num : numbers) {
            map.put(num, map.getOrDefault(num,0)+1);
        }
        // If value is more than two then we will bring it out
        System.out.println(map);
        for(Map.Entry<Integer, Integer> set : map.entrySet()){
            if(set.getValue()==1) {
                System.out.println("The unique element is: " + set.getKey());
            }
        }
    }
}
