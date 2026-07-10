package paytm;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "Govind");
        map.put("2", "Sanjay");
        map.put("3","Komal");
        System.out.println(map);
        // Task is to print the values of the keys present in the map which are
        // currently not in lower case of course.
        int i = 1;
        for(Map.Entry<String, String> set : map.entrySet()) {
            System.out.println(i++);
            String updateValue = set.getValue().toLowerCase();
            set.setValue(updateValue);
            System.out.println(set);
        }
    }
}
