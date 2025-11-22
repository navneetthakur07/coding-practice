package stream.misc;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StreamIntermediateOperationsExample {

    public static void main(String[] args) {
        List<List<String>> listOfList = Arrays.asList(
               Arrays.asList("Reflection", "Collection", "Stream"),
                Arrays.asList("Structure", "State", "Flow"),
                Arrays.asList("Sorting", "Mapping", "Reduction", "Stream")
        );

        Set<String> intermediateOperation =  new HashSet<>();
        List<String> finalResultedList = listOfList.stream()
                .flatMap(List::stream)
                .filter(name -> name.startsWith("S"))
                .map(String::toUpperCase)
                .distinct()
                .sorted()
                .skip(1)
                .peek(s-> intermediateOperation.add(s))
                .toList();

        intermediateOperation.forEach(System.out::println);
        System.out.println("Final Result:\n "+ finalResultedList);
    }
}
