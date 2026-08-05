package Binary_search;

public class Find_Smallest_Letter_Greater_Than_Target {
    public static void main(String[] args) {

    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        int low = 0,high = n-1;
        char res = letters[0];

        while(low <= high){
            int mid = low + (high - low)/2;

            if(letters[mid] > target){
                res = letters[mid];
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return res;
    }

}
