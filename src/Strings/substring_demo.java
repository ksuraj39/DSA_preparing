package Strings;

public class substring_demo {
    public static void main(String[] args) {
        String s1 = "hello";
//        System.out.println(s1.substring(1,4));
//        System.out.println(s1.substring(2));
        printall(s1);
    }
    public static void printall(String s1){
        for (int i = 0; i < s1.length(); i++) {
            for (int j = i+1; j <= s1.length(); j++) {
                System.out.println(s1.substring(i,j)+" ");
            }
            System.out.println();
        }
    }
}
