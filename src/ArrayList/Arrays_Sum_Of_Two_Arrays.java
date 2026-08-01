package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Arrays_Sum_Of_Two_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int [] brr = new int[m];
        for (int i = 0; i < m; i++) {
            brr[i] = sc.nextInt();
        }
        sumTwoArray(arr,brr);
    }
    public static void sumTwoArray(int[]arr,int[]brr){
        ArrayList<Integer> result = new ArrayList<>();

        int i = arr.length-1;
        int j = brr.length-1;
        int carry = 0;

        while(i>=0 && j>=0){
            int sum = carry+ arr[i]+brr[j];
            result.add(sum%10);
            carry = sum/10;
            i--;
            j--;
        }

        while(i>=0){
            int sum = carry+ arr[i];
            result.add(sum%10);
            carry = sum/10;
            i--;
        }
        while(j>=0){
            int sum = carry+brr[j];
            result.add(sum%10);
            carry = sum/10;
            j--;
        }

        if(carry!=0){
            result.add(carry);
        }

        for (int k = result.size()-1; k >=0 ; k--) {
            System.out.print(result.get(k)+", ");
        }
        System.out.println("END");
    }

}
