package assignment_6;

public class Recursion_Subsequences {
    static  int count ;
    public static void main(String[] args) {
        count = 0;
        subsequences("abcd","");
        System.out.println("\n"+count);
    }
    public static void subsequences(String s,String ans){
        if(s.length() == 0){
            System.out.print(ans+" ");
            count++;
            return;
        }


        char ch = s.charAt(0);
        subsequences(s.substring(1),ans);
        subsequences(s.substring(1),ans+ch);
    }
}
