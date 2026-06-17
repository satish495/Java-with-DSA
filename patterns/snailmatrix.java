package patterns;

import java.util.*;

public class snailmatrix {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[][] mat=new int[n][n];
        int top=0,bottom=n-1;
        int left=0,right=n-1;
        int num=1;
        while(num<=n*n){
             // Left to Right
            for (int i = left; i <= right; i++) {
                mat[top][i] = num++;
            }
            top++;

            // Top to Bottom
            for (int i = top; i <= bottom; i++) {
                mat[i][right] = num++;
            }
            right--;

            // Right to Left
            for (int i = right; i >= left; i--) {
                mat[bottom][i] = num++;
            }
            bottom--;

            // Bottom to Top
            for (int i = bottom; i >= top; i--) {
                mat[i][left] = num++;
            }
            left++;
        }

        // Print matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        

    }
    
}
