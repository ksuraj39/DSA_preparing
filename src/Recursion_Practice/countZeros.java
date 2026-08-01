package Recursion_Practice;

public class countZeros {
    public static void main(String[] args) {
        int n = 1000230003;
        System.out.println(zeors(n,0));
    }
    public static int zeors(int n,int count){
        if(n==0) return count;
        if(n%10 == 0) count+=1;
        return zeors(n/10,count);
    }
}
