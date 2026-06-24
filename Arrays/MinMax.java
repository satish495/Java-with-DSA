package Arrays;
import java.util.*;
public class MinMax{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max)
                max=arr[i];
            else if (arr[i]<min) {
                min=arr[i];
                
            }
        }
        System.out.println(min);
        System.out.println(max);

    }
}