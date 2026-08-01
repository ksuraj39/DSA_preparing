package Recursion_Practice;

public class removeduplicate {
    public static void main(String[] args) {
        String s = "aabb";
        System.out.println(remove(s,0,""));
    }
    public static String remove(String s, int i,String ans){
        if (i==s.length()-1) return ans+s.charAt(i);
        if(s.charAt(i) != s.charAt(i+1)) ans += s.charAt(i);
        return remove(s,i+1,ans);
    }
}
