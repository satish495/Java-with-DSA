package Number_System;
import java.util.Scanner;
public class happy {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        while(n>1){
            int sum=0;
            while(n>9){
                int rem=n%10;
                sum+=rem*rem;
                n/=10;
            }
            n=sum;
        }
        if(n==1){
            System.out.println(" is a happy number");
        }        
        else{
            System.out.println(" is not a happy number");
        }
    }
}
