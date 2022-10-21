package vvod_zadachi;

public class task5 {
    public static void main(String[] args) {
        System.out.println(cat(-517));
        System.out.println(pr(-546));
    }
    public static String cat(int a) {
        if (a > 0) {
            if ((20 >= (a % 100)) && ((a % 100) >= 11)) {
                return a + " котов";
            } else if ((a % 10 >= 5) || (a % 10 == 0)) {
                return a + " котов";
            } else if ((4 >= a % 10) && ((a % 10) >= 2)) {
                return a + " кота";
            } else if (a % 10 == 1) {
                return a + " кот";
            }
        }
        else if (a < 0) {
            if ((-11 >= (a % 100)) && ((a % 100) >= -20)) {
                return a + " котов";
            } else if ((a % 10 <= -5) || (a % 10 == 0)) {
                return a + " котов";
            } else if ((-2 >= a % 10) && ((a % 10) >= -4)) {
                return a + " кота";
            } else if (a % 10 == -1) {
                return a + " кот";
            }
        }
        return null;
    }
    public static int pr(int a){
        return -a % 10;
    }
}
