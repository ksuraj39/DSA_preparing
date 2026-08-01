package leetcode;

public class onePlus {
    public static void main(String[] args) {
        int [] arr= {9};
        int []result = onePlusNum(arr);

        for(int i=0;i< result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
    public static int[] onePlusNum(int []arr){
       int num = number(arr)+1;
       return null;
    }
    public static int number(int[]num){
        int n = num.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum*10+num[i];
        }
        return sum;
    }

}
