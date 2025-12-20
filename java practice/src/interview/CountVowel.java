package interview;

public class CountVowel {
    public static void main(String[] args) {
        String word = "Rythm";
        Integer count = 0;

        char[] charArr = word.toCharArray();
        for (char c : charArr) {
            if (c == 'a' || c == 'A' ||
                    c == 'e' || c == 'E' ||
                    c == 'i' || c == 'I' ||
                    c == 'o' || c == 'O' ||
                    c == 'u' || c == 'U') {
                count++;
            }
        }
        System.out.println(count);
    }
}
