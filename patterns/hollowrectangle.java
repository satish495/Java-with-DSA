package patterns;

import java.util.Scanner;

public class hollowrectangle {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int row=s.nextInt();
        int col=s.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(i==1||i==row||j==1||j==col)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        
    }
    
}
