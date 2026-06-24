import java.util.*;
public class remveduplicate{
	public static void main(String[] args) {
	
		
		Scanner p=new Scanner(System.in);
		int n=p.nextInt();
		int[]a=new int[n];
		for(int i=0;i<n;i++){
		    a[i]=p.nextInt();
		}
		if(n==0){
		    System.out.print(0);
		    return;
		}
	
	    int j=0;
	    for(int i=0;i<n;i++){
	        if(a[i]!=a[j]){
	            j++;
	            a[j]=a[i];
	        }
	    }
	    System.out.println(j+1);
	    for(int i=0;i<=j;i++){
	        System.out.println(a[i]);
	    }
		
	}
}
