package Hackathon;

import java.util.Scanner;

public class Angry_Thanos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        removeDouble(arr);

    }
    public  static  void removeDouble(int []arr){
        int k=2;
        for (int i = 2; i < arr.length; i++) {
            if(arr[i]!=arr[k-2]){
                arr[k] = arr[i];
                k++;
            }
        }

        for (int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
