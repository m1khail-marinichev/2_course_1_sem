import java.util.Arrays;

public class MultidimentionalArrays {
    public static void main(String[] args) {
        int[][] printTable_massiv = new int[][]{{10, 20, 30}, {40, 50, 60, 70}, {100, 200}};
        printTable(printTable_massiv);
        int[][] printTablealigned_massiv = new int[][]{{10, 2, 305677}, {40, 60546, 700}, {10047, 20, 8678}};
        printTableAligned(printTablealigned_massiv);
    }

    private static void printTable(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(Arrays.toString(a[i]));
        }
    }

    private static void printTableAligned(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                int m = 0;
                for (int k = 0; k < a.length; k++)
                    if (a[k][j] >= m)
                        m = a[k][j];
                String probel = "";
                String chislo = a[i][j] + "";
                String ms = "" + m;
                if (m != a[i][j])
                    for (int p = 1; p <= ms.length() - chislo.length(); p++)
                        probel += " ";
                System.out.print(probel + a[i][j] + "  ");
            }
            System.out.println("\n");
        }
    }
}
