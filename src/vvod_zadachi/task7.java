package vvod_zadachi;

public class task7 {
    public static void main(String[] args) {
        System.out.println(isPrimality(17));
    }
    public static boolean isPrimality(int a) {
        double kor = Math.sqrt(a);
        int koren = (int)Math.round(kor);
        int flag = 0;
        for (int i = 2; i <= koren; i++) {
            int ost = a % i;
            if (ost == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 0)
            return true;
        return false;
    }
}
