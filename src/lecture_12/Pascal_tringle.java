package lecture_12;

import java.util.ArrayList;
import java.util.List;

public class Pascal_tringle {
    public static void main(String[] args) {
        int n = 30;
        System.out.println(getRow(n));
    }

    public static List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> pascal = new ArrayList<>();
        long ncr = 1;
        for(int row = 0;row<rowIndex+1;row++){
            pascal.add((int)ncr);
            ncr = ncr*(rowIndex-row)/(row+1);
        }
        return pascal;
    }
}
//[1, 33, 528, 5456, 40920, 237336, 1107568, 4272048, 13884156, 38567100, 92561040, 193536720, 354817320, 573166440,
//        818809200, 1037158320, 1166803110, 1166803110, 1037158320, 818809200, 573166440, 354817320, 193536720,
//        92561040, 38567100, 13884156, 4272048, 1107568, 237336, 40920, 5456, 528, 33, 1]