import java.util.Arrays;

public class  ArraysTasks {
    public static void main(String[] args) {
        System.out.println(Even(6));
        System.out.println(allSimilar({2, 6, 4, 8, 3}));
    }
    private static String Even(int n) {
        int[] a = new int[n];
        int x = 1;
        for (int i = 0; i < n; i++) {
            a[i] = x * 2;
            x++;
        }
        String otvet = Arrays.toString(a);
        //System.out.println(Arrays.toString(a));
        return otvet;
    }

    private static Boolean allSimilar(int[] a) {
        int flag = 0;
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    flag = 1;
                    break;
                }
            }
        };
        if (flag == 0)
            return true;
        else
            return false;
    }

}