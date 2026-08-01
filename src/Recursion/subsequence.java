package Recursion;

public class subsequence {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(print(s,""));
//        sequence(s,0,"");
//        sequence1(s,"");
    }
    public static int print(String s, String ans){
        if(s.length()==0){
            System.out.println(ans + " ");
            return 1;
        }
        char ch = s.charAt(0);
        int a1 = print(s.substring(1),ans);
        int a2 = print(s.substring(1),ans+ch);
        return a1+a2;
    }




//    static int count = 0;
//    public static void sequence1(String s,String ans){
//        if(s.length() == 0){
//            System.out.println(ans);
//            count++;
//            return;
//        }
//        char ch = s.charAt(0);
//        sequence1(s.substring(1),ans);
//        sequence1(s.substring(1),ans+ch);
//    }
//    // appraoch 1
//    public static void sequence(String s,int idx,String ans){
//        if(idx == s.length()){
//            System.out.print(ans+" ");
//            return;
//        }
//        char ch = s.charAt(idx);
//        sequence(s,idx+1,ans);
//        sequence(s,idx+1,ans + ch);
//    }

}
