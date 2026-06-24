package DSA.Search;

import java.util.Scanner;

public class FindPages {
     public static int findPages(int[] A, int M, int N)
    {
        if(M > N) return -1;
        int low = 0, high = 0;
        for(int book : A)
        {
            low = Math.max(low,book);
            high += book;
        }
        int ans = -1;
        while(low <= high)
        {
            int mid = low + (high - low) / 2;
            if(isPossible(A,M,mid))
            {
                ans = mid;
                high = mid - 1;

            }
        }
        return ans;
    }
    public static boolean isPossible(int[] A,int students,int maxPages)
    {
        int studentsRequired = 1;
        int currentPages = 0;
        for(int book : A)
        {
            if(currentPages + book > maxPages)
            {
                studentsRequired++;
                currentPages = book;
                if(studentsRequired >students) 
                    return false;
            }
            else currentPages += book;
        }
        return true;
    }    
        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        
        int[] A = new int[n];
        for(int i = 0; i < n; i++) {
            A[i] = s.nextInt();
        }
        
        int m = s.nextInt();
        
        int result = findPages(A, m, n);
        System.out.println(result);
        
        s.close();
    }

}
