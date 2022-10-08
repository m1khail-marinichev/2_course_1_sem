package vvod_zadachi;

public class task1 {
    public static void main(String[] args) {
        int x = 100;
        if (x / 100 >= 1) {
            if (x / 1000 < 1) {
                System.out.println("В числе 3 цифры");
            }
            else {
                System.out.println("В числе не 3 цифры");
            }
        }
        else {
            System.out.println("В числе не 3 цифры");
        }
    }
}