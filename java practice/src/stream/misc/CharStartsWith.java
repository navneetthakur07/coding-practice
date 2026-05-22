package stream.misc;

import java.util.List;

public class CharStartsWith {
    public static void main(String[] args) {

        List<String> list = List.of("Gaurav", "Himanshu", "Sanjay",
                "Raghav", "Gauri", "Gunjan");

        List<String> filteredList = list.stream()
                .filter(str -> str.toLowerCase().startsWith("g")).toList();
        System.out.println(filteredList);
    }
}
