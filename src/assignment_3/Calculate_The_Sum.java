package assignment_3;

import java.util.Scanner;

public class Calculate_The_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextDouble();
        }
        int q = sc.nextInt();
        while(q>=1){
            int x = sc.nextInt();
            Opertion(arr,x);
            q--;
        }
        System.out.println(cal_sum(arr));
    }
    public static int cal_sum(double []arr){
        int sum = 0;
        for(int i = 0;i < arr.length;i++){
            sum+=arr[i];
        }
        return sum%((int)Math.pow(10,9)+7);
    }

    // apply opertion
    public static void Opertion(double []arr,int x){
        double [] temp = new double[arr.length];
        int n = arr.length;
        for(int i = 0;i< arr.length;i++){

            temp[i] = arr[i]+arr[(i-x+n)%n];
        }
        for(int i = 0;i< arr.length;i++){
            arr[i]=temp[i];
        }
    }
}

