package linkedIn;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfEachCharacter {

    public static void main(String[] args) {

        List<Character> characterList = List.of('a', 'b', 'v', 'c', 'a', 'c', 'c');

        // Task is to count the frequency of each character of the List provided above
        // I will first use the approach of HashMap then we will try to write it with the implementation of the
        // Stream APIs

        Map<Character, Integer> map = new HashMap<>();
        for(Character c : characterList) {
            map.put(c, map.getOrDefault(c,0)+1);
        }

        System.out.println(map);

        // now we are going to use the Stream API operation for fetching the count of each element
        Map<Character, Long> countOfElements = characterList.stream()
                .collect(Collectors.groupingBy(c-> c, Collectors.counting()));

        System.out.println(countOfElements);

        String names = "GauravGurudev";

        Map<Character, Long> contOfElement = names.toLowerCase().chars()
                .mapToObj(c-> (char)c)
                .collect(Collectors.groupingBy(
                        c-> c, Collectors.counting()
                ));

        System.out.println("Frequency of each character is: " + contOfElement);
    }
}
