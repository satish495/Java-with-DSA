package patterns;
import java.util.*;
public class PascalTriangle {
    public static void pascal(int n){
        for(int i=0;i<n;i++){
            int num=1;
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
               
            }
            for(int j=0;j<=i;j++){
                System.out.print(num+" ");
                num=num*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int row=10;
        pascal(row);
    }
    
}
