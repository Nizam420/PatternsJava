package Patterns;

public class Patterns28 {
    public static void main(String[] args) {
        pat28(5);
    }

    static void pat28(int n){
        for (int row = 0; row < 2 * n; row++) {
            int c = row > n ? 2 * n - row : row;
            int spaces = n - c;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < c; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
