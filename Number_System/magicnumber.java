package Number_System;
import java.util.Scanner;
public class magicnumber{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        while(n>9){
            int sum=0;
            while(n>0){
                int rem=n%10;
                sum+=rem;
                n/=10;
            }
            n=sum;
        }
        if(n==1){
            System.out.println(" is a magic number");
        }        
        else{
            System.out.println(" is not a magic number");
        }
    }
    
}
