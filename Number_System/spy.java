import java.util.Scanner;
public class spy {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sum=0;
        int product=1;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            product*=rem;
            n/=10;
        }
        if(sum==product){
            System.out.println(" is a spy number");
        }        
        else{
            System.out.println(" is not a spy number");
        }
    }
}