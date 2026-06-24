
import java.util.*;

public class MergeOverlappingIntervals {
    public static void main(String[] args) {

        Scanner p = new Scanner(System.in);

        int n = p.nextInt();

        int[][] intervals = new int[n][2];

        for(int i = 0; i < n; i++) {
            intervals[i][0] = p.nextInt(); // start
            intervals[i][1] = p.nextInt(); // end
        }

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int i = 1; i < n; i++) {

            if(intervals[i][0] <= end) {
                end = Math.max(end, intervals[i][1]);
            } else {
                System.out.println("[" + start + "," + end + "]");
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }

        System.out.println("[" + start + "," + end + "]");
    }
}