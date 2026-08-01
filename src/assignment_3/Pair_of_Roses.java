package assignment_3;

import java.util.Scanner;

public class Pair_of_Roses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // test case number
        while(t>=1){
            int n = sc.nextInt();
            int[] price=new int[n];
            for(int i =0;i<n;i++){
                price[i] = sc.nextInt();
            }
            int m = sc.nextInt();
            sorting(price);
            of_Roses(price,m);
            t--;
        }
    }
    // buy roses
    public static void of_Roses(int[]arr,int m){
        int rose1 = 0,rose2 = 0;
        int Minimumdiff = Integer.MAX_VALUE;
        for(int i=0;i< arr.length;i++){
            int diff =0;
            for(int j =i+1;j< arr.length;j++){
                if(arr[i]+arr[j]==m){
                    diff=arr[j]-arr[i];
                   if(diff<Minimumdiff){
                       Minimumdiff = diff;
                       rose1 = arr[i];
                       rose2 = arr[j];
                   }
                }
            }
        }
        System.out.println("Deepak should buy roses whose prices are "+rose1+" and "+rose2+".");
    }

    // sorting
    public static void sorting(int [] arr){
        for(int i =1;i< arr.length;i++){
            for(int j = 0;j< arr.length-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =temp;
                }
            }
        }
    }
}
