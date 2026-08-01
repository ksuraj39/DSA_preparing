package String_Question;

public class Reverse_String_II {
    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg",2));

    }
    public static String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        for (int i = 1; i < n-1;) {
            char temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = temp;
            i+=k;
        }
        return new String(arr);
    }
}
