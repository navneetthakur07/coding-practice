package linkedIn;

import java.util.Comparator;
import java.util.List;

public class SortedListOnStringLength {

    public static void main(String[] args) {

        List<String> names = List.of("Aman", "Ajay", "Sanjy", "Gauravandit", "Pankaj", "Anirudha Acharya");

        // for printing the list in reverse order of length
        names.stream()
                .sorted(Comparator.comparingInt(String::length)
                        .reversed())
                .forEach(System.out::println);

        // if we encounter the String with same length then it will sort on the basis of alphabetical order
        // comparator.nauturalOrder() will work here it will sort on the basis of alphabetical order
        /*
        thenComparing()
         */
        names.stream()
                .sorted(Comparator.comparingInt(String::length)
                        .reversed()
                        .thenComparing(Comparator.naturalOrder())
                        .thenComparing(word-> word.startsWith("S")))
                .forEach(System.out::println);

    }
}

