package Number_System;
import java.util.Scanner;
public class perfect {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        n*=n;
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n){
            System.out.println(" is a perfect number");
        }        
        else{
            System.out.println(" is not a perfect number");
        }
    }
    
}
