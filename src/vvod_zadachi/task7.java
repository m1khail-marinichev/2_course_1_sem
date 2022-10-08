package vvod_zadachi;

public class task7 {
    public static void main(String[] args) {
        double a = 18;
        int x = (int) a;
        double kor = Math.sqrt(a);
        int koren = (int)Math.round(kor);
        int flag = 0;
        for (int i = 2; i <= koren; i++) {
            int ost = x % i;
            if (ost == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 0)
            System.out.println("число простое");
        else
            System.out.println("число не простое");
    }
}
