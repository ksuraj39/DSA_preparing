package assignment_6;

import java.util.Scanner;

public class first_index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(findindex(arr,n-1,target));
    }
    public static int findindex(int[]arr,int idx,int target){
        if (idx == 0) return -1;

        int ans = findindex(arr, idx - 1, target);

        if (ans != -1) return ans;

        if (arr[idx] == target) return idx;

        return -1;
    }
}
