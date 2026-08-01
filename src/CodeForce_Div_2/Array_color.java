package CodeForce_Div_2;

import java.util.*;

public class Array_color {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();  // size of array
            int [] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(isPossible(arr));
        }
    }
    public static String isPossible(int[]arr){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]%2==arr[i+1]%2){
                return "NO";
            }
        }
        return "YES";
    }
}

