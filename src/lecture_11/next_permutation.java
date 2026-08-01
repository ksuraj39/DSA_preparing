package lecture_11;

public class next_permutation {
    public static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void  permutation(int[] arr){
        int n = arr.length;
        int pivot = -1;

        // step 1 find pivot
        for(int i = n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                pivot = i;
                break;
            }
        }
        if(pivot==-1){
            reverse(arr,0,n-1);
            return;
        }
        // step 2: find the largest value
        int q = -1;
        for(int i= arr.length-1;i>pivot;i--){
            if(arr[i]>arr[pivot]){
                q=i;
                break;
            }
        }
        // step 3 swap pivot and q index value
        int temp = arr[pivot];
        arr[pivot] = arr[q];
        arr[q] = temp;

        // step 4

        reverse(arr,pivot+1,n-1);

    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        permutation(arr);
        for (int i = 0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
