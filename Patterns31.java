package Patterns;

public class Patterns31 {
    public static void main(String[] args) {
        pat31(4);
    }

    static void pat31(int n) {
        int originalN = n;
        n = 2 * n;
        for (int row = 1; row <= n-1; row++){
            for (int col = 1; col <= n-1; col++) {
                //for middle max element
                //int atEveryIn =Math.min(Math.min(row, col), Math.min(n - row, n - col));
                // for middle min element
                int atEveryIn = originalN - Math.min(Math.min(row-1, col-1), Math.min(n - row-1, n - col-1));
                System.out.print(atEveryIn + " ");
            }
            System.out.println();
        }
    }
}
