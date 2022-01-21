package Patterns;

public class Patterns2 {
    public static void main(String[] args) {
        pat2(5);
    }

    static void pat2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
