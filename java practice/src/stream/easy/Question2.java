package stream.easy;

import java.util.List;

public class Question2 {
    public static void main(String[] args) {
        List<String> listOfString = List.of("Pawan", "Raghav", "Joshi", "Pankaj");

        List<String> updatedString = listOfString.stream()
                .map(str -> str.toUpperCase())
                .toList();

        System.out.println(updatedString);
    }
}
