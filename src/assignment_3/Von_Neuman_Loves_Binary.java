package assignment_3;


import java.util.Scanner;

public class  Von_Neuman_Loves_Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i<n ; i++){
            arr[i] = sc.nextLong();
        }
        Von_Neuman(arr);
        for (int i =0;i< arr.length;i++){
            System.out.println(arr[i]);
        }

    }
    public static void Von_Neuman(long [] arr){
        for(int i =0;i<arr.length;i++){
            arr[i] = binaryToDecimal(arr[i]);
        }
    }
    public static int binaryToDecimal(long n){
        int sum = 0;
        int i =0 ;
        while(n!=0){
            long r = n%10;
            sum+= (int) (r * Math.pow(2,i));
            i++;
            n/=10;
        }
        return sum;
    }
}


