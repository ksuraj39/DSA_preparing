package Sliding_window;

public class frequrency_arr {
    public static void main(String[] args) {
        String str = "jsdfnquhxcxmvnalsufhewqiuhslkjdcvncxmvalh";
        int []arr = new int[26];
        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);
            arr[ch-'a']++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
