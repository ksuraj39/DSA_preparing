package Weekly_Contest_469;

public class Minimum_String_Length_After_Balanced_Removals {
    public static void main(String[] args) {
        String s = "aaaa";
        System.out.println(minLengthAfterRemovals(s));
    }
    public static int minLengthAfterRemovals(String s) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='b'){
                b++;
            }else{
                a++;
            }
        }
        return Math.abs(a-b);
    }
}
