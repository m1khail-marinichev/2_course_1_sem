package vvod_zadachi;

public class task2 {
    public static void main(String[] args) {
        System.out.println(isLast5(67656));
    }
    public static boolean isLast5(int a) {
        if (a % 10 == 5)
            return true;
        return false;
    }

}
