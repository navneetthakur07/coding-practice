package arivihan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Interview {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Govind");
        list.add("Govind");
        list.add("Sanjay");
        list.add("Sanjay");
        list.add("Govind");
        System.out.println(list);
        // Goal is to print a map with the String(name) and Integer(count)

        Map<String, Integer> map = new HashMap<>();
        for(String str : list) {
            map.put(str, map.getOrDefault(str,0)+1);
        }
        System.out.println(map);
    }
}
