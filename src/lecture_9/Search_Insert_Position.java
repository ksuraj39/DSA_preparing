package lecture_9;

public class Search_Insert_Position {
    public static void main(String[] args) {
        int [] arr ={1,2,3,5,7,8};
        int item  = 0;
        System.out.println(Search_Insert(arr,item));
    }


    public static int Search_Insert(int [] arr,int item) {
        int low = 0;
        int high = arr.length-1;
        while (low<=high ){
            int mid = low+(high-low)/2;
            if(arr[mid]==item){
                return mid;
            } else if (arr[mid]<=item) {
                low = mid+1 ;
            }else{
                high = mid-1;
            }
        }
        return  low ;
    }
}
