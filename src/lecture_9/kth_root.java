package lecture_9;

public class kth_root {
    public static void main(String[] args) {
        int n=100;
        int bad = 30;
        System.out.print(KthRoot(n,bad));
    }
    public static int KthRoot(int n,int k){
        int low = 1;
        int high = n;
        int ans = 0;
        while(low<=high){
            int mid = (low+high)/2;
            if(Math.pow(mid,k)<=n){
                ans = mid;
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return ans;
    }
}
