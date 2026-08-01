package D2_array;

public class two_array {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        System.out.println(arr);           // whole array address
        System.out.println(arr[0]);    // address of first element
        System.out.println(arr[0][2]);     // element
        System.out.println(arr.length);     // row size
        System.out.println(arr[0].length);  // col size
    }
}
