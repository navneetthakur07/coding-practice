package stream.misc;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//public class CountWords {
//    public static void main(String[] args) {
//        List<String> words = Arrays.asList("Apple", "Apple", "Banana", "Apple", "Mango", "Mango");
//        Map<String, Integer> map = new HashMap<>();
//        for(String word : words){
//            map.put(word, map.getOrDefault(word, 0)+1);
//        }
//        System.out.println(map);
//    }
//}

public class CountWords {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Apple", "Apple", "Banana", "Apple", "Mango", "Mango");
        Map<String, Long> map = words.stream()
                .collect(Collectors.groupingBy(
                   Function.identity(),
                   Collectors.counting()
                ));

        System.out.println(map);
    }
}
