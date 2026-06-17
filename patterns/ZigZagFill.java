package patterns;
import java.util.Scanner;

public class ZigZagFill {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[][] mat = new int[n][n];
        int num = 1;

        for (int d = 0; d < 2 * n - 1; d++) {

            int rowStart = Math.max(0, d - n + 1);
            int rowEnd = Math.min(n - 1, d);

            for (int row = rowStart; row <= rowEnd; row++) {
                int col = d - row;
                mat[row][col] = num++;
            }
        }
 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}