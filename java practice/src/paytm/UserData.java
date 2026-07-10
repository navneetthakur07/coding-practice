package paytm;

public class UserData {
    public static void main(String[] args) {
        String str = "45 TOPS NPU";
        int count = 0;
        char[] ch = str.toCharArray();
        for(int i =0; i<ch.length; i++) {
            count++;
        }
        System.out.println(count);
    }
}
