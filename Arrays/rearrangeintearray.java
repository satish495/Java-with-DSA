import java.util.*;

public class rearrangeintearray {

    static void rightRotate(int[] arr, int start, int end) {
        int temp = arr[end];

        for (int i = end; i > start; i--) {
            arr[i] = arr[i - 1];
        }

        arr[start] = temp;
    }

    public static void main(String[] args) {

        Scanner p = new Scanner(System.in);

        int n = p.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = p.nextInt();
        }

        for (int i = 0; i < n; i++) {

            boolean wrong =
                    (i % 2 == 0 && arr[i] >= 0) ||
                    (i % 2 == 1 && arr[i] < 0);

            if (wrong) {

                int j = i + 1;

                while (j < n) {

                    if ((i % 2 == 0 && arr[j] < 0) ||
                        (i % 2 == 1 && arr[j] >= 0)) {
                        break;
                    }

                    j++;
                }

                if (j == n)
                    break;

                rightRotate(arr, i, j);
            }
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}

