package recursion_practise;

public class Char_Is_Present {
    public static void main(String[] args) {
        String str = "abcbhjaijai";
        char ch = 'a';
        int i = 2;
        System.out.println(Is_present(str,ch,i));
    }
    public static boolean Is_present(String str,char ch,int idx){
        for (int i = idx; i < str.length(); i++) {
            if(str.charAt(i) == ch) return  true;
        }
        return false;
    }
}
