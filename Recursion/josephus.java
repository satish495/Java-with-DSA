package Recursion;

import java.util.*;

public class josephus {
    public static int Josephus (int n,int m){
        if(n==1)
            return 1;
        return (Josephus(n-1, m)+m-1)%n;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int survivor=Josephus(n,m);
        System.out.println(survivor);
    } 
}
