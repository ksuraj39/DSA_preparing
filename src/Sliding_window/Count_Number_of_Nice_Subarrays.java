package Sliding_window;

public class Count_Number_of_Nice_Subarrays {
    public static void main(String[] args) {

    }
    public static int numberOfSubarrays(int[] nums, int k) {
        int subARR = 0;
        int sum = 0;

         // grow window
         // shrink;
         // update answer


        return 0;
    }
    public static int isOdds(int[] arr,int si,int ei){
        int count = 0;
        while(si<=ei){
            if(arr[si]%2!=0){
                count++;
                si++;
            }
        }
        return count;
    }
}

