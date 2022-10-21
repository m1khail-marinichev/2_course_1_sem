package vvod_zadachi;

public class task1 {
    public static void main(String[] args) {
        System.out.println(is3Digit(10));
    }
    public static boolean is3Digit(int a) {
        if (a / 100 >= 1)
            if (a / 1000 < 1)
                return true;
        return false;
    }
}