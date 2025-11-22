package stream.misc;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class StreamTerminalOperationsExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Reflection","Collection","Stream",
                "Structure","Sorting","State"
        );

        List<String> blankList = new LinkedList<>();

        // forEach: Print each name
        names.stream()
                .forEach(System.out::println);

        // collect: Collect names starting with 'S' into a list
        List<String> sNames = names.stream()
                .filter(s->s.startsWith("S"))
                .toList();

        System.out.println(sNames);

        // reduce: Concatenate all names into a single string
        String concatenatedNames = names.stream()
                .reduce(
                    "",(partialString, element) -> partialString + " " + element
                );
        System.out.println(concatenatedNames);

        // count: to count the number of elements
        Long count = names.stream()
                .count();

        System.out.println(count);

        // findFirst: to find the first element of a List
        Optional<String> findFirst = names.stream()
                .findFirst();
        findFirst.ifPresent(System.out::println);
        System.out.println(blankList.isEmpty());

        blankList.addFirst("Sanjay");
        Optional<String> temp = blankList.stream().findFirst();
        System.out.println("temp:" + temp);
        System.out.println(blankList);
        System.out.println(blankList.isEmpty());

        // all Matches: if it satisfies the given criteria
        Boolean allMatch = names.stream()
                .allMatch(s-> s.startsWith("S"));
        System.out.println(allMatch);

        // any Match: if any satisfies the given criteria
        Boolean anyMatchExample = names.stream()
                .anyMatch(s->s.startsWith("S"));
        System.out.println(anyMatchExample);
    }
}
