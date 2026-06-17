import java.util.*;
public class jacobstal {
   public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int a=0;
    int b=1;
    
    if(n<0){
        System.out.println("enter the number first");
    }
    for(int i=1;i<n;i++){
        System.out.println(a);
        int c=b+2*a;
        a=b;
        b=c;
        
    }
    
   } 
}
