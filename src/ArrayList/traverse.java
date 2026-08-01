package ArrayList;

import java.util.ArrayList;

public class traverse {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(11);
        arr.add(2);
        arr.add(30);
        System.out.println(arr);
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();

        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
