package SDI_AI_ques;

import java.util.Scanner;

public class count_Symmetric_integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        System.out.println(countSymmetric(low,high));
    }
    public static int countSymmetric(int low,int high){
        int count = 0;
        for (int i = low; i <=high ; i++) {
            if(i>=low && isSymmetric(i)){
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println();
        return count;
    }
    public static boolean isSymmetric(int n){
        int temp = n;
        int count = 0;
        while(n>0){
            count++;
            n/=10;
        }
        if(count % 2 !=0) return false;
        int leftsum = 0;
        int rightsum = 0;
        int a = 1;
        while(a<=count){
            int rem = temp%10;
            if(a<=count/2) {
                leftsum += rem;
            }else{
                rightsum+=rem;
            }
            a++;
            temp/=10;
        }
        return leftsum==rightsum;
    }
}
