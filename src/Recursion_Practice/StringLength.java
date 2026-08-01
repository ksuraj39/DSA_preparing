package Recursion_Practice;

public class StringLength {
    public static void main(String[] args) {
        String s = "String";
        System.out.println(len(s,0,0));
    }
    public static int len(String s,int idx,int l){
        if(idx == s.length()) return l;
        l++;
        return len(s,idx+1,l);
    }
}
