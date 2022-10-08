package vvod_zadachi;

public class task3 {
    public static void main(String[] args) {
        int x = 23544;
        int y = x % 10;
        if ((x % 100) % 10 == y) {
            System.out.println("На конце 2 одинаковые цифры");
        }
        else {
            System.out.println("На конце не 2 одинаковые цифры");
        }
    }
}
