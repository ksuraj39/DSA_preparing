package div_3;

import java.util.Scanner;

public class Deletion_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            if(isSorted(arr)){
                System.out.println(n);
            }else{
                System.out.println(1);
            }
        }
    }
    public static boolean isSorted(int[]arr){
        if(arr.length==1) return true;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]> arr[i+1])return false;
        }
        return true;
    }

}
