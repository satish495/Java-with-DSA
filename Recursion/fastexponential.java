package Recursion;
import java.util.*;
public class fastexponential {
    public static int fastExpo(int a,int b){
        if(b==0){
            return 1;
        }
        if(b%2==0){
            return fastExpo(a*a,b/2);
        }
        else{
            return a*fastExpo(a*a,(b-1)/2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(fastExpo(a,b));
    }
}
