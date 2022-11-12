import java.util.Arrays;

public class  ArraysTasks {
    public static void main(String[] args) {
        //System.out.println(Arrays.toString(Even(6)));
        //System.out.println(allSimilar(new int[] {2}));
        //System.out.println(hasSimilar(new int[] {2, 2, 3}));
        //System.out.println(Mean(new int[] {2, 654, 2, 3}));
        Shift(new int[] {10, 20, 30, 40, 50, 60, 70, 80});
        System.out.println(Arrays.toString(copyShift(new int[] {10, 20, 30, 40, 50, 60, 70, 80, 90})));
        //System.out.println(re(new int[] {}));
    }
    private static int[] Even(int n) {
        if (n < 0) {
            int[] a = {};
            return a;
        }
        else {
            int[] a = new int[n];
            int x = 1;
            for (int i = 0; i < n; i++) {
                a[i] = x * 2;
                x++;
            }
            return a;
        }
    }

    private static boolean allSimilar(int[] a) {
        if (a.length == 0)
            return false;
        if (a.length < 2)
            return true;
        for (int i : a)
            if (a[0] != i)
                return false;
        return true;
    }

    private static boolean hasSimilar(int[] a) {
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

    private static void Shift(int[] a) {
        if (a.length == 0)
            System.out.println(Arrays.toString(a));
        else {
            int b = a[a.length - 1];
            for (int i = a.length - 1; i > 0; i--) {
                a[i] = a[i-1];
            }
            a[0] = b;
            System.out.println(Arrays.toString(a));
        }
    }

    private static int[] copyShift(int[] a) {
        if (a.length == 0)
            return a;
        else {
            int[] new_a = new int[a.length];
            int b = a[a.length - 1];
            for (int i = a.length - 1; i > 0; i--) {
                new_a[i] = a[i-1];
            }
            new_a[0] = b;
            return new_a;
        }
    }
}