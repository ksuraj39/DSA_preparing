package recursion_practise;

public class dice {
    public static void main(String[] args) {
        int n = 4;
        path(n,0,"");
    }
    public static void path(int n,int curr,String ans){
        if(curr==n){
            System.out.print(ans+" ");
            return;
        }
        if(curr > n)return;
        for(int i=1;i<=3;i++) {
            path(n, curr + i, ans+i);
        }
    }

}
