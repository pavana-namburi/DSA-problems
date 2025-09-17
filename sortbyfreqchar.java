import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class sortbyfreqchar {
    class pair{
    int f;
    char c;
    public pair(int f, char c){
        this.f = f;
        this.c = c;
    }
}

class sortdec implements Comparator<pair>{
    public int compare(pair a, pair b){
        if(a.f==b.f)
            return a.c-b.c;
        else
            return a.f-b.f;
    }
}

class Solution {
    public String frequencySort(String s) {
        // code here
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char i:s.toCharArray()){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        PriorityQueue<pair> pq=new PriorityQueue<>(new sortdec());
        for(Map.Entry<Character,Integer> e:hm.entrySet()){
            pq.add(new pair(e.getValue(),e.getKey()));
        }
        String ans="";
        while(!pq.isEmpty()){
            pair al=pq.poll();
            int v=al.f;
            char k=al.c;
            for(int m=0;m<v;m++)
                ans+=k;
        }
        return ans;
    }
};
}


/* without storing and sorting pairs or list
  class Solution {
    public String frequencySort(String s) {
        // code here
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char i:s.toCharArray()){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        ArrayList<Character> pq=new ArrayList<>(hm.keySet());
        pq.sort((a,b)->{
                int p=hm.get(a)-hm.get(b);
                if(p==0)
                    return a-b;
                else
                    return p;
        });
        StringBuilder sb = new StringBuilder();
        int h=0;
        for(char ch:pq){
            for(int i=0;i<hm.get(ch);i++)
                sb.append(ch);
        }
        return sb.toString();
    }
};
 */