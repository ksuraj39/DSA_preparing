package lecture_11;

import java.util.Scanner;

public class Maximum_sum_path_array {
    public static int Maximum_sum_path(int[] arr,int[] brr){
        int ans = 0;
        int i = 0,j = 0 ,p = 0,q = 0;
        while(i< arr.length && j< brr.length){
            if(arr[i]<brr[j]){
                i++;
            } else if (arr[i]>brr[j]) {
                j++;
            } else {
                int sum1 = 0;
                for (int k = p;k<=i;k++){
                    sum1 +=arr[k];
                }
                int sum2 = 0;
                for (int k = q;k<=j;k++){
                    sum2 +=brr[k];
                }
                ans += Math.max(sum1,sum2);
                i++;
                j++;
                p = i;
                q = j;
            }
        }
        int sum1 = 0;
        while(p<arr.length){
            sum1 += arr[p++];
        }

        int sum2 = 0;
        while(q<brr.length){
            sum2 += brr[q++];
            q++;
        }

        ans += Math.max(sum1,sum2);

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int m = sc.nextInt();
            int n = sc.nextInt();
            int[] arr = new int[m];
            for(int i = 0;i< arr.length;i++){
                arr[i] = sc.nextInt();
            }

            int[] brr = new int[n];
            for(int i = 0;i< brr.length;i++){
                brr[i] = sc.nextInt();
            }

            System.out.println(Maximum_sum_path(arr,brr));
        }
    }
}
