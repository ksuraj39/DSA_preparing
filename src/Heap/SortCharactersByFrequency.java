package Heap;
import java.util.*;

public class SortCharactersByFrequency {
    class Pair implements Comparable<Pair> {
        char ch;
        int freq;
        Pair (char ch,int freq){
            this.ch = ch;
            this.freq = freq;
        }
        public int compareTo(Pair t){
            if(this.freq == t.freq) {
                return t.ch - this.ch;
            }
            return t.freq - this.freq;

        }

    }

    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for(char key : map.keySet()){
            int freq = map.get(key);

            pq.add(new Pair(key,freq));
        }

        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()){
            Pair top = pq.poll();
            sb.append(top.ch);
        }
        return sb.toString();
    }
}
