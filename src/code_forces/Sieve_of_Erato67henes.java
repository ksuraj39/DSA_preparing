package code_forces;

import java.util.Scanner;

public class Sieve_of_Erato67henes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int [] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]= sc.nextInt();
            }
            System.out.println(check(arr));
        }
    }
    public static String check(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 67){
                return "YES";
            }
        }
        return "NO";
    }
}
