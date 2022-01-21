package Patterns;

public class Patterns5 {
    public static void main(String[] args) {
        pat5(5);
    }

    static void pat5(int n){
        for (int row = 0; row < 2 * n; row++) {
            int c = row > n ? 2 * n - row : row;
            for (int col = 0; col < c; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
