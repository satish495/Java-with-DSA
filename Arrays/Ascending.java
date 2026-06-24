package Arrays;
import java.util.*;
public class Ascending {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        boolean issorted=true;
       
         for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                issorted= false; 
                break;
            }
        }
        if(issorted)
            System.out.println("sorted");
        else
            System.out.println("unsorted");
    }
        
    
}
