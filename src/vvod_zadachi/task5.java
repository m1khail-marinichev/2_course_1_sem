package vvod_zadachi;

public class task5 {
    public static void main(String[] args) {
        int x = 351;
        if ((20 >= (x % 100)) && ((x % 100) >= 11)) {
            System.out.println(x + " котов");
        }
        else if ((x % 10 >= 5) || (x % 10 == 0)) {
            System.out.println(x + " котов");
        }
        else if ((4 >= x % 10) && ((x % 10) >= 2)) {
            System.out.println(x + " кота");
        }
        else if (x % 10 == 1) {
            System.out.println(x + " кот");
        }
    }
}
