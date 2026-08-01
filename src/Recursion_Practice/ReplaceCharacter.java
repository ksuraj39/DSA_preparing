package Recursion_Practice;

public class ReplaceCharacter {
    public static void main(String[] args) {
        String s = "cat";    // 'a' -> 'o'
//        replace(s);
        System.out.println(replace(s));
    }
    public static String replace(String s){
        if(s.length()==0) {
            return "";
        }
        char ch = s.charAt(0);
        if(ch=='a'){
            return 'o' + replace(s.substring(1));
        }else{
            return ch + replace(s.substring(1));
        }
    }
}
