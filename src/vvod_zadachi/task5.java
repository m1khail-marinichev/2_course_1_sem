package vvod_zadachi;

public class task5 {
    public static void main(String[] args) {
        System.out.println(cat(-517));
    }
    public static String cat(int a) {
        if (a == 0)
            return  a + " kotov";
        else if (a > 0) {
            if ((20 >= (a % 100)) && ((a % 100) >= 11))
                return a + " kotov";
            else if ((a % 10 >= 5) || (a % 10 == 0))
                return a + " kotov";
            else if ((4 >= a % 10) && ((a % 10) >= 2))
                return a + " kota";
            else if (a % 10 == 1)
                return a + " kot";
        }
        else if (a < 0) {
            if ((-11 >= (a % 100)) && ((a % 100) >= -20))
                return a + " kotov";
            else if ((a % 10 <= -5) || (a % 10 == 0))
                return a + " kotov";
            else if ((-2 >= a % 10) && ((a % 10) >= -4))
                return a + " kota";
            else if (a % 10 == -1)
                return a + " kot";
        }
        return null;
    }
}
