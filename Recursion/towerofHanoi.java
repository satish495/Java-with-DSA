package Recursion;
import java.util.*;
public class towerofHanoi {
    public static void tower(int n,char src,char dest,char helper){
        if(n==0){
            return;
        }
        tower(n-1,src,helper,dest);
        System.out.println("Move "+n+" from "+src+" to "+dest);
        tower(n-1,helper,dest,src);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        tower(n,'A','C','B');
        sc.close();
    }
}
