package linkedIn;

import java.util.*;

public class DuplicateElementsInAList {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Sanjay", "Raghav","Komal", "Komal", "Raghav");
        List<String> words = List.of("Sanjay", "Raghav", "Komal", "Raghav");
        Map<String, Integer> map = new HashMap<>();

        // we will use the key value pair for the List provided above according to count we will print the duplicate value
        //  As soon as we encounter the count we will print it

        for(String word : words) {
            map.put(word, map.getOrDefault(word, 0)+1);
        }

        /*
        When you call map.entrySet(), it gives you:
        [ ("apple"=2), ("banana"=3), ("orange"=1) ]
        A Set containing all these pairs as Entry objects.
         */

        for (Map.Entry<String, Integer> entry: map.entrySet())
        {
            if(entry.getValue()>1) {
                System.out.println(entry.getKey());
            }
        }

        // Alternative to the above approach

        System.out.println("Using modern approach of for each");
        map.forEach((word, count) -> {             // Gets both key and value directly
            if (count > 1) {
                System.out.println(word);
            }
        });

        map.forEach((word,count) -> {
            if(count>1) {
                System.out.println(word);
            }
        }
        );

        // now we will be going to use the stream for finding the duplicate value from a list of String
        // Here we have used the terminal operation which is given by the Consumer Functional Interface
        // initially I have used a List<String> which was the mistake I have commited while writing the code

        Set<String> newSet =  new HashSet<>();
         words.stream()
                .filter(duplicate -> !newSet.add(duplicate))
                .forEach(System.out::println);
    }
}
