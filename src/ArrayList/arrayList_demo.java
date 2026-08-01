package ArrayList;

import java.util.ArrayList;

public class arrayList_demo {
    public static void main(String[] args) {
        ArrayList<Integer> arr =  new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(5);
        System.out.println(arr);

        arr.add(3,55);    //o(1)
        System.out.println(arr);
    }
}
