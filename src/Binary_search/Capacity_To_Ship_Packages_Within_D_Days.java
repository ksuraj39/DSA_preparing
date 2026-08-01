package Binary_search;

public class Capacity_To_Ship_Packages_Within_D_Days {
    public static void main(String[] args) {
        int []weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        System.out.println(shipWithinDays(weights,days));
    }
    public static int shipWithinDays(int[] weights, int days) {
        int low = -1;
        int high = 0;
        for(int weigh : weights){
            low = Math.max(weigh,low);
            high += weigh;
        }

        int minweight = high;
        while(low <=     high){
            int mid = low + (high - low)/2;
            if(isPossible(weights,mid,days)){
                minweight = Math.min(mid,minweight);
                high = mid - 1;
            }else{
                low = mid + 1;
            }

        }
        return minweight;
    }
    public static boolean isPossible(int [] arr,int weight,int days){
        int d = 1;
        int sum = 0;
        for(int w : arr){
            sum += w;
            if(sum > weight){
                sum = w;
                d++;
            }
            if(d > days) return false;
        }
        return true;
    }
}
