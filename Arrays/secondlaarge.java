import java.util.*;
public class secondlaarge{

	public static void main(String[] args) {
	
		Scanner p=new Scanner(System.in);
		int n=p.nextInt();
		int[]a=new int[n];
		for(int i=0;i<n;i++){
		    a[i]=p.nextInt();
		}
		int large=a[0],sconlarge=a[0];
		for(int i=0;i<n;i++){
		    if(a[i]>large){
		        sconlarge=large;
		        large=a[i];
		    }
		        else if(a[i]!=large&& a[i]>sconlarge){
		          sconlarge=a[i];
		        
		    }
		    
		}
		
		System.out.println(sconlarge);
	}
}
