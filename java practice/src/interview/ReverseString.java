package interview;

public class ReverseString {

    public static void main(String[] args) {
        String input = "poster";
        String reversedString = new StringBuilder(input).reverse().toString();
        System.out.println(reversedString);
    }
}
