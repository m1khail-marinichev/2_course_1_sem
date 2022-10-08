import java.util.Arrays;

public class  ArraysTasks {
    public static void main(String[] args) {
        System.out.println(Even(6));
        //System.out.println(allSimilar({2, 5, 7, 34}));
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


}