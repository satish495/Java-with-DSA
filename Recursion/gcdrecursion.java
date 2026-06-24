package Recursion;
import java.util.*;
 class gcdrecursion {
    public static int gcd(int a,int b){
        if(b==0){
           return a;
        }
        return gcd(b,a%b);
    }
    public static void main(String[] args){
        Scanner p=new Scanner(System.in);
        int a=p.nextInt();
        int b=p.nextInt();
        System.out.println(gcd(a,b));

    }
    
}
