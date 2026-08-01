package D2_array;

public class wave_print {
    public static void main(String[] args) {
        int [][] arr = {
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}
        };
        Display(arr);
    }
    public static void Display(int [][]arr){
        for(int col = 0;col<arr[0].length;col++){
            if(col%2==0){
                for (int row = 0; row < arr.length; row++) {
                    System.out.print(arr[row][col]+" ");
                }
            }else{
                for (int row = arr.length-1; row >=0 ; row--) {
                    System.out.print(arr[row][col]+" ");
                }
            }
        }
    }
}
