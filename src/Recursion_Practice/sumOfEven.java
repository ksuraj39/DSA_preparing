package Recursion_Practice;

public class sumOfEven {
    public static void main(String[] args) {
        int n = 123456;
        System.out.println(sum(n,0));
    }
    public static int sum(int n,int sum){
        if(n==0) return sum;
        if((n%10)%2==0) sum += n%10;
        return sum(n/10,sum);
    }
}
