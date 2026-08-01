package Recursion;

public class nCoin {
    public static void main(String[] args) {
        int n = 4;
//        print(n,"");
        print1(n,"");
    }
    // nth coin print ,which have not double Head
    public static void print1(int n,String s){
        if(n==0) {
            System.out.println(s);
            return;
        }
        if(s.length() == 0 || s.charAt(s.length()-1) != 'H'){
            print1(n-1,s+'H');
        }
        print1(n-1,s+'T');
    }
    // nth coin print
    public static void print(int n,String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        print(n-1,ans+'H');
        print(n-1,ans+'T');
    }
}
