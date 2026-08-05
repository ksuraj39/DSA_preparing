package Binary_search;

//     Question name : Find Smallest Letter Greater Than Target
//     Leetcode Number : 744
//     Level : Easy
/*
    Constraints:

        2 <= letters.length <= 104
        letters[i] is a lowercase English letter.
        letters is sorted in non-decreasing order.
        letters contains at least two different characters.
        target is a lowercase English letter.

 */

public class Find_Smallest_Letter_Greater_Than_Target {
    public static void main(String[] args) {
        char[] letter = {'c','f','j'};
        char target = 'c';
        System.out.println(nextGreatestLetter(letter,target));
    }
    /*      Solution : using Binary search (Upper bound concept)
            TC -- O(log n) ,  SC -- O(1)
     */
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
