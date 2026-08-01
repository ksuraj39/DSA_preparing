package maths;

public class Remove_Zeros_Decimal {
    public static void main(String[] args) {
        long n = 10200200;
        System.out.println(removesZeros(n));
    }
    public static long removesZeros(long n){
        long count = 0;
        long m= 1;
        while(n>0){
            long rem = n%10;
            if(rem!=0){
                count = rem*m+count;
                m*=10;
            }
            n/=10;
        }
        return count;
    }
}
