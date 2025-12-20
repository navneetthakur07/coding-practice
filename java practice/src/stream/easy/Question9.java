package stream.easy;

import java.util.Arrays;
import java.util.List;

public class Question9 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Pawn", "Navneet", "Fugal", "Prakash", "Akash",
                "Atsushi", "", "Karan");

        System.out.println(names);
        List<String> withoutBlankString = names.stream()
                .filter(str-> !str.isBlank())
                .toList();

        System.out.println(withoutBlankString);
    }
}
