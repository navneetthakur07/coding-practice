public class SwappingNumbers {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println("x = " + x + " & y = " + y);
        System.out.println("after swapping executed");
        swapNum(x,y);
    }

    // this method is to swap the two numbers without using the third variable
    public static void swapNum(int x, int y){
        x = x + y; // 10+20=30
        y = x - y; // 30-20=10
        x = x - y; // 30-10=20
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
