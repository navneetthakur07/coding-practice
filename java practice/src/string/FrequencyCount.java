package string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FrequencyCount {
    public static void main(String[] args) {
        String words = "abccde";
        System.out.println(countAlphabets(words));
    }

    public static int countAlphabets(String words) {
        char[] charArr = words.toCharArray();
        Set<Character> set = new HashSet<>();
        for(char word: charArr){
            set.add(word);
        }
        return set.size();
    }
}
