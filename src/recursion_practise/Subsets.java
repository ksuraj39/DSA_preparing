//package recursion_practise;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Subsets {
//    public static void main(String[] args) {
//        int[] arr ={1,2,3};
//        List<List<Integer>> ans = new ArrayList<>();
//        List<Integer> ll = new ArrayList<>();
//        subset(arr,0,ll,ans);
//        System.out.println(ans);
//    }
//    public static void subset(int[]arr,int idx,List<Integer> ll,List<List<Integer>> ans){
//        if(idx == arr.length){
//            ans.add(new ArrayList<>(ll));
//            return;
//        }
//        for (int i= idx; i < arr.length; i++) {
//            ll.add(arr[i]);
//            subset(arr,i,ll,ans);
//            ll.remove(ll.size()-1);
//        }
//    }
//}
