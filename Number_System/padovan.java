import java.util.*;
public class padovan {
   public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int a=1;
    int b=1;
    int c=1;
    if(n<0){
        System.out.println("enter the number first");
    }
    for(int i=1;i<n;i++){
        System.out.println(a);
        int d=a+b;
        a=b;
        b=c;
        c=d;
    }
    
   } 
}
