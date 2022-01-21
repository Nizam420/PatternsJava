package Patterns;

public class Patterns4 {
    public static void main(String[] args) {
        pat4(5);
    }
    static void pat4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
