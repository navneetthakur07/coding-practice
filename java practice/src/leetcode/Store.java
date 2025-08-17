package leetcode;

import java.util.List;

public class Store {
    public static void main(String[] args) {
        System.out.println(nameStartsWithA(List.of("Aarav", "Ananya", "Rohan", "Meera", "Aditi",
                "Kuna", "Priya", "Arjun", "Neha", "Siddhartha")));
    }

    public static List<String> nameStartsWithA (List<String> name) {

        return name.stream().filter(
                p-> p.startsWith("A")
        ).toList();
    }
}
