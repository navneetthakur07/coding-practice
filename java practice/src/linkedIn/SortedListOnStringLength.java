package linkedIn;

import java.util.Comparator;
import java.util.List;

public class SortedListOnStringLength {

    public static void main(String[] args) {

        List<String> names = List.of("Aman", "Sanjy", "Gauravandit", "Pankaj", "Anirudha Acharya");

        names.stream()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .forEach(System.out::println);

    }
}

