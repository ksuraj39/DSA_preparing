package Weekly_Contest_469;

public class Count_Distinct_Integers_After_Removing_Zeros {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(countDistinct(n));
    }
    public static long countDistinct(long n) {
        long count = 0;
        for (long i = 1; i <=n ; i++) {
            String s = String.valueOf(i);
            if(s.contains("0")) continue;
            count++;
        }
        return count;
    }
    
}
