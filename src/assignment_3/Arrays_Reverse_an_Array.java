package assignment_3;

import java.util.Scanner;

public class Arrays_Reverse_an_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        
        Reverse(arr);

    }
    public static void Reverse(int []arr){
        for(int i = arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
