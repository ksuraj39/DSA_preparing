package assignment_3;

import java.util.Scanner;

public class Product_of_Array_Except_Self {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int []result =  Product_of_Array(arr);
        for(int  i = 0;i< result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
    public static int[] Product_of_Array(int[] arr){
        int n = arr.length;
        int[] temp = new int[n];
        temp[0] = 1;
        for(int i =1;i<n;i++){
            temp[i] = temp[i-1]*arr[i-1];
        }

        int suffix =1;
        for(int i= n-2;i>=0;i--){
            suffix *= arr[i+1];
            temp[i] *= suffix;
        }
        return temp;
    }
}
