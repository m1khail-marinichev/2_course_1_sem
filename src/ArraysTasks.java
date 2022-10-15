import java.util.Arrays;

public class  ArraysTasks {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Even(6)));
        int[] allSimilar_massiv = {2, 2, 2};
        System.out.println(allSimilar(allSimilar_massiv));
        int[] hasSimilar_massiv = {2, 2, 3};
        System.out.println(hasSimilar(hasSimilar_massiv));
        int[] mean_massiv = {2, 654, 2, 3};
        System.out.println(Mean(mean_massiv));
        int[] shift_massiv = {10, 20, 30, 40, 50, 60, 70, 80};
        Shift(shift_massiv);
        int[] copyShift_massiv = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        System.out.println(Arrays.toString(copyShift(copyShift_massiv)));
    }
    private static int[] Even(int n) {
        int[] a = new int[n];
        int x = 1;
        for (int i = 0; i < n; i++) {
            a[i] = x * 2;
            x++;
        }
        return a;
    }

    private static boolean allSimilar(int[] a) {
        if (a.length < 2)
            return true;
        for (int i : a)
            if (a[0] != i)
                return false;
        return true;
    }

    private static boolean hasSimilar(int[] a) {
        int flag = 1;
        for (int i = 0; i < a.length - 1; i++)
            for (int j = i + 1; j < a.length; j++)
                if (a[i] == a[j])
                    return true;
        return false;
    }

    private static double Mean(int[] a) {
        double sum = 0;
        for (int i: a)
            sum += i;
        return sum / a.length;
    }

    private static void Shift(int[] a) { //{10, 20, 30, 40, 50, 60, 70, 80}
        for (int i = 0; i < a.length / 2; i++) {
            int b = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = b;
        }
        System.out.println(Arrays.toString(a));
    }

    private static int[] copyShift(int[] a) {
        int[] new_a = new int[a.length];
        new_a[a.length - 1] = a[0];
        for (int i = a.length - 1; i > 0; i--) {
            new_a[a.length - i - 1] = a[i];
        }
        return new_a;
    }
}