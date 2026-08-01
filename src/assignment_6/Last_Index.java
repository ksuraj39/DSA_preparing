package assignment_6;

import java.util.Scanner;

public class Last_Index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(findindex(arr,0,target));
    }
    public static int findindex(int[]arr,int idx,int target){
        if (idx == arr.length) return -1;

        int ans = findindex(arr, idx + 1, target);

        if (ans != -1) return ans;

        if (arr[idx] == target) return idx;

        return -1;
    }
}
