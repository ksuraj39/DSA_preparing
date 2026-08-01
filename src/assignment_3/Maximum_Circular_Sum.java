import java.util.*;
public class Maximum_Circular_Sum {
    public static int kadane(int[] a) {
        int maxSum = a[0];
        int curr = a[0];
        for (int i = 1; i < a.length; i++) {
            curr = Math.max(a[i], curr + a[i]);
            maxSum = Math.max(maxSum, curr);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int total = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                total += arr[i];
            }

            int max1 = kadane(arr);

            int[] arr2 = new int[n];
            for (int i = 0; i < n; i++) {
                arr2[i] = -arr[i];
            }
            int minSub = -kadane(arr2);

            int max2 = total - minSub;

            if (max1 < 0) {
                System.out.println(max1);
            } else {
                System.out.println(Math.max(max1, max2));
            }
        }
    }
}