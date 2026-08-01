package D2_array;

public class transpose {
    public static void main(String[] args) {
        int [][] arr = {
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}
        };
        System.out.println("before transpose :");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
        Transpose(arr);
        System.out.println("After transpose :");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }

   public static void Transpose(int[][]arr){
       for (int row = 0; row < arr.length; row++) {
           for (int col = row; col < arr[0].length; col++) {
               int temp = arr[row][col];
               arr[row][col] = arr[col][row];
               arr[col][row]  = temp ;
           }
       }
   }
}
