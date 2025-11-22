package interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapImpl {
    public static void main(String[] args) {

        Map<Integer, List<String>> map = new HashMap<>();
        map.put(1, Arrays.asList("Aman", "Raja"));
        map.put(2, Arrays.asList("Pankaj", "Sanjay"));
        map.put(3, Arrays.asList("Sonam", "Kajal"));

        System.out.println(map);

    }
}
