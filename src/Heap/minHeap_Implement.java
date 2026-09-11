package Heap;

import Binary_search.Arranging_Coins;

import java.util.ArrayList;

public class minHeap_Implement {

    static class Heap {
        private ArrayList<Integer> ll = new ArrayList<>();

        // add element
        public void add(int x){
            ll.add(x);
            upheafify(ll.size()-1);
        }
        private void upheafify(int ci) {

            if(ci <= 0) return;

            int pi = (ci - 1)/2;   // parent index
            if(ll.get(pi) > ll.get(ci)){
                swap(pi,ci);
                upheafify(pi);
            }
        }
        private void swap(int i,int j){
                //swap
                int ith = ll.get(i);
                int jth = ll.get(j);

                ll.set(j,ith);
                ll.set(i,jth);
        }

        // remove element
        public int remove(){
            int x = ll.get(0);
            swap(0, ll.size()-1);
            ll.remove(ll.size()-1);
            downHeapify(0);
            return x;
        }
        private void downHeapify(int pi) {
            if(pi > ll.size()) return;

            int lci = 2 * pi + 1;
            int rci = 2 * pi + 2;

            int min_idx = pi;
            if(lci < ll.size() && ll.get(lci) < ll.get(rci)){
                min_idx = lci;
            }

            if(rci < ll.size() && ll.get(lci) > ll.get(rci)){
                min_idx = rci;
            }

            if(min_idx != pi){
                swap(pi,min_idx);

                downHeapify(min_idx);
            }
        }

        public int get(){
            return ll.get(0);
        }

    }
    public static void main(String[] args) {
        Heap mp = new Heap();


    }
}
