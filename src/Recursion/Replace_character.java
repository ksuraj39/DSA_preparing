package Recursion;

public class Replace_character {
    public static void main(String[] args) {
        String s = "chat";
        Replace(s,"");
        System.out.println(Replace1(s));
    }
    public static String Replace1(String s){
        if(s.length()==0) {
            return "";
        }
        char ch = s.charAt(0);
        if(ch == 'a'){
            return 'o' + Replace1(s.substring(1));
        }else{
            return ch + Replace1(s.substring(1));
        }
    }

    public static void Replace(String s,String ans){
        if(s.length()==0) {
            System.out.println(ans);
            return;
        }
        char ch = s.charAt(0);
        if(ch == 'a'){
            Replace(s.substring(1),ans + 'o');
        }else{
            Replace(s.substring(1),ans + ch);
        }
    }
}
