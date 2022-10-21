package vvod_zadachi;

public class task3 {
    public static void main(String[] args) {
        System.out.println(isSameDigits(00));
    }
    public static boolean isSameDigits(int a) {
        int y = a % 10;
        if ((a / 10) % 10 == y && a != 0)
            return true;
        return false;
    }
}
