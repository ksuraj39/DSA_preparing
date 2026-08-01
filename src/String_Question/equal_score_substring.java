package String_Question;

public class equal_score_substring {
    public static void main(String[] args) {
        System.out.println(EqualScore("adcb"));
    }
    public static boolean EqualScore(String s){
        int n = s.length();
        int total = 0;
        for (int i = 0; i < n; i++) {
            total+=s.charAt(i)-'a'+1;
        }
        int prefix = 0;
        for (int i = 0; i <n ; i++) {
            prefix+=s.charAt(i)-'a'+1;
            if(prefix*2==total) return true;
        }
        return false;
    }
}
