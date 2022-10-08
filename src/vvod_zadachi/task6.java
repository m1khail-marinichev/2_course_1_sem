package vvod_zadachi;

public class task6 {
    public static void main(String[] args) {
        float a = 5;
        float b = 4;
        float c = -1 ;
        if (a == 0) {
            float x1 = -c / b;
            System.out.println("одно решение, х = %.2f".formatted((x1)));
        }
        else if (c == 0) {
            if (c == b && b == 0) {
                float x1 = 0;
                System.out.println("одно решение, х = %.2f".formatted((x1)));
            }
            else {
                float x1 = 0;
                float x2 = -b / a;
                if (x1 > x2) {
                    System.out.println("два решения, х1 = %.2f".formatted(x2) + ", x2 = %.2f".formatted(x1));
                }
                else {
                    System.out.println("два решения, х1 = %.2f".formatted(x1) + ", x2 = %.2f".formatted(x2));
                }
            }
        }
        else {
            if (a + b + c == 0) {
                float x1 = 1;
                float x2 = c / a;
                if (x1 > x2)
                    System.out.println("два решения, х1 = %.2f".formatted(x2) + ", x2 = %.2f".formatted(x1));
                else
                    System.out.println("два решения, х1 = %.2f".formatted(x1) + ", x2 = %.2f".formatted(x2));
            }
            else if (a - b + c == 0) {
                float x1 = -1;
                float x2 = -c / a;
                if (x1 > x2)
                    System.out.println("два решения, х1 = %.2f".formatted(x2) + ", x2 = %.2f".formatted(x1));
                else
                    System.out.println("два решения, х1 = %.2f".formatted(x1) + ", x2 = %.2f".formatted(x2));
            }
            else {
                double d = Math.pow(b, 2);
                d = d - 4 * a * c;
                if (d < 0)
                    System.out.println("решений нет");
                else if (d == 0) {
                    double x1 = (-b + Math.pow(d, 0.5)) / (2 * a);
                    System.out.println("одно решение, х = %.2f".formatted(x1));
                }
                else {
                    double x1 = (-b + Math.pow(d, 0.5)) / (2 * a);
                    double x2 = (-b - Math.pow(d, 0.5)) / (2 * a);
                    if (x1 > x2)
                        System.out.println("два решения, х1 = %.2f".formatted(x2) + ", x2 = %.2f".formatted(x1));
                    else
                        System.out.println("два решения, х1 = %.2f".formatted(x1) + ", x2 = %.2f".formatted(x2));
                }
            }
        }
    }
}
