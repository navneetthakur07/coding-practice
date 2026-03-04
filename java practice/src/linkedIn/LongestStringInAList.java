package linkedIn;

import java.util.*;

public class LongestStringInAList {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Sanajay", "Raghav","Komal", "Komal", "Raghav");

        Set<String> newSet = new HashSet<>(words);

//        Map<String, Integer> map = new HashMap<>();
//        for(String name : newSet) {
//            map.put(name, name.length());
//        }
//
//        String maxLengthKey = null;
//        int maxLength = 0;
//
//        for(Map.Entry<String, Integer> entry : map.entrySet()) {
//            if(entry.getValue()> maxLength) {
//                maxLengthKey = entry.getKey();
//                maxLength = entry.getValue();
//            }
//        }
//
//        System.out.println("Maximum Length of String in List is: " + maxLengthKey);

        String maximumLengthString = Collections.max(newSet, Comparator.comparing(String::length));
        System.out.println(maximumLengthString);

        // Now let's solve the above problem with the Stream API approach
        words.stream()
                .sorted(Comparator.comparingInt(String::length))
                .forEach(word -> System.out.println(word));
    }
}
