package lecture_12;

public class Duplicate_Zeros {
    public static void main(String[] args) {
        int [] arr = {1,0,2,3,0,4,5,0};
        duplicateZeros(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void duplicateZeros(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(arr[i]==0){
                swap(arr,i);
                i++;
            }
        }
    }
    public static void swap(int [] arr,int k){
        int n = arr.length;
        for(int i = n-2;i>=k;i--){
             arr[i+1] = arr[i];
        }
        arr[k] = 0;
    }
}
