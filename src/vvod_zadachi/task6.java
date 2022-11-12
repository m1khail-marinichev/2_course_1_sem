package vvod_zadachi;

public class task6 {
    public static void main(String[] args) {
        System.out.println(getQuadraticEquationSolution(1, -16, 64));
    }
    public static String getQuadraticEquationSolution(int a, int b, int c) {
        if (a == 0) {
            if (b == 0 && c == 0)
                return "there are infinitely many solutions";
            else {
                float x1 = -c / b;
                return "one solution x = %.2f".formatted(x1);
            }
        }
        else if (c == 0) {
            if (c == b && b == 0) {
                float x1 = 0;
                return "one solution x = %.2f".formatted(x1);
            }
            else {
                float x1 = 0;
                float x2 = -b / a;
                if (x1 > x2) {
                    return String.format("two solutions x1 = %.2f, x2 = %.2f", x2, x1);
                }
                else {
                    return String.format("two solutions x1 = %.2f, x2 = %.2f", x1, x2);
                }
            }
        }
        else {
            if (a + b + c == 0) {
                float x1 = 1;
                float x2 = c / a;
                if (x1 > x2)
                    return String.format("two solutions x1 = %.2f, x2 = %.2f", x2, x1);
                else
                    return String.format("two solutions x1 = %.2f, x2 = %.2f", x1, x2);
            }
            else if (a - b + c == 0) {
                float x1 = -1;
                float x2 = -c / a;
                if (x1 > x2)
                    return String.format("two solutions x1 = %.2f, x2 = %.2f", x2, x1);
                else
                    return String.format("two solutions x1 = %.2f, x2 = %.2f", x1, x2);
            }
            else {
                double d = Math.pow(b, 2);
                d = d - 4 * a * c;
                if (d < 0)
                    return "no solution";
                else if (d == 0) {
                    double x1 = (-b + Math.pow(d, 0.5)) / (2 * a);
                    return "one solution x = %.2f".formatted(x1);
                }
                else {
                    double x1 = (-b + Math.pow(d, 0.5)) / (2 * a);
                    double x2 = (-b - Math.pow(d, 0.5)) / (2 * a);
                    if (x1 > x2)
                        return String.format("two solutions x1 = %.2f, x2 = %.2f", x2, x1);
                    else
                        return String.format("two solutions x1 = %.2f, x2 = %.2f", x1, x2);
                }
            }
        }
    }
}
