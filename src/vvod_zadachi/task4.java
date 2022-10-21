package vvod_zadachi;

public class task4 {
    public static void main(String[] args) {
        System.out.println(isLeapYear(1704));
    }
    public static boolean isLeapYear(int a) {
        if (a % 400 == 0)
            return true;
        else if (a % 100 == 0)
            return false;
        else if (a % 4 == 0)
            return true;
        return false;
    }
}
