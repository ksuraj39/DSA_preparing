package lecture_9;

public class first_bad_version {
    public static void main(String[] args) {
        int n =100;
        System.out.println(first_bad(n));
    }

    public static int first_bad(int n){
        int low = 1;
        int high = n;
        int ans = 0;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(isBadVersion(mid)){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }

    public static boolean isBadVersion(int n){
        int bad = 30;
        return n>=bad ;
    }

}
