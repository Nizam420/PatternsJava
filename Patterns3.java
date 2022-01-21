package Patterns;

public class Patterns3 {
    public static void main(String[] args) {
        pat3(5);
    }
    static void pat3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
