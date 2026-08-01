package Recursion_Practice;

public class countConsonant {
    public static void main(String[] args) {
        String s = "String";
        System.out.println(count(s,0,0));
    }
    public static int count(String s , int i , int c){
        if(i==s.length()) return c;
        char ch = Character.toLowerCase(s.charAt(i));
        if(ch >= 'a' && ch <='z' && ch != 'a' && ch != 'e' &&ch != 'i' &&ch != 'o' &&ch != 'u' ){
            c++;
        }
        return count(s,i+1,c);
    }
}
