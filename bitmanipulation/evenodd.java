package bitmanipulation;
import java.util.Scanner;
class evenodd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<=n;i++){
            int num = sc.nextInt();
        if((num &1)==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }

    }
}