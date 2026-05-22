package arivihan;

public class Interview1 {
    public static void main(String[] args) {
        String s1 = "abc"; // string pool
        String s2 = "ab" + "c";
        String temp = "c";
        String s3 = "ab" + temp;

        System.out.println(s1==s2); // address reference - false
        System.out.println(s1==s3); // true
    }
}
