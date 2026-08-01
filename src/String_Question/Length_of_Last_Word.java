package String_Question;

public class Length_of_Last_Word {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }
    public static int lengthOfLastWord(String s) {
        s = s.trim();
        String [] arr = s.split(" +");

        int l = arr.length;
        for (int i = 0; i < l; i++) {
            System.out.print(arr[i]+" ");
        }
        return arr[l-1].length();
    }
}
