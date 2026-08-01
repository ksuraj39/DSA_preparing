package assignment_3;

import java.util.Scanner;

public class Inverse_of_an_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
          int[] arr = new int[n];
        for(int i = 0 ;i<n;i++){
            arr[i] = sc.nextInt();
        }
        encode(arr);
        for(int i = 0 ;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    // encode
    public static void encode(int[] arr){
        int n = arr.length;
        for(int i = 0;i < n;i++){
            arr[arr[i]%n]+=i*n;
        }

        for(int j = 0;j<n;j++){
            arr[j]/=n;
        }
    }


}
