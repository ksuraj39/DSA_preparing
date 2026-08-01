package lecture_11;

public class Maximum_circular_Sum {
    public static void main(String[] args) {
        int [] arr = {2,3,-17,11,5,-30,4};
        System.out.println(Max_circular(arr));
    }
    public static int Max_circular(int []arr){
        int linear_max = kadanes(arr);
        int total_sum = 0;
        for(int i = 0;i< arr.length;i++){
            total_sum += arr[i];
            arr[i] = arr[i]*-1;
        }

        int circular_sum = total_sum + kadanes(arr);
        if(circular_sum==0){
            return linear_max;
        }
        return Math.max(circular_sum,linear_max);
    }
    // kadanes
    public static int kadanes(int[] arr){
        int ans = Integer.MIN_VALUE,sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            ans = Math.max(ans,sum);
            if(sum<0){
                sum=0;
            }
        }
        return ans;
    }
}
