package interview;

import java.util.*;
import java.util.stream.Collectors;

public class TreeMapExample {

    public static void main(String[] args) {

        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "Karan");
        map.put(2, "Sanjay");
        map.put(3, "Prem");
        map.put(4, "Bablu");
        map.put(5, "Lavish");

        System.out.println(map);

        List<Map.Entry<Integer, String>> sortedMap =  map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .toList();

        System.out.println(sortedMap);

    }
}
