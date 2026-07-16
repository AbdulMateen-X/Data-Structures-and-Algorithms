package _07_Strings;
import java.util.PriorityQueue;


class Pair{
    char ch;
    int freq;

    public Pair(char ch,int freq){
        this.ch = ch;
        this.freq = freq;
    }
}

public class _08_Sort_Characters_By_Frequency_LC_451 {

    public String frequencySort(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder(n);

        //Calculate Frequency
        int[] freq = new int[128];
        for(char ch: s.toCharArray()){
            freq[ch]++;
        }

        //Making Max_heap Priority Queue
        PriorityQueue<Pair> pq = new PriorityQueue<>((p1,p2) -> Integer.compare(p2.freq,p1.freq));

        for(int i=0;i<128;i++){
            if(freq[i] != 0)
                pq.offer(new Pair((char)i,freq[i]));
        }

        while(!pq.isEmpty()){
            Pair current = pq.poll();
            for(int i=0;i<current.freq;i++){
                sb.append(current.ch);
            }
        }
        return sb.toString();
    }
}
