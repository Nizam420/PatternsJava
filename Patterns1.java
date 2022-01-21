package Patterns;

public class Patterns1 {
    public static void main(String[] args) {
        pat1(5);
    }

    static void pat1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

