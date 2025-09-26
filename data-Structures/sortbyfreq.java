import java.util.*;
public class sortbyfreq {
    public static void main (String[] args) {
		//code here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int i=0;
		while(i<t){
		    int s=sc.nextInt();
		    int a[]=new int[s];
		    for(int j=0;j<s;j++)
		        a[j]=sc.nextInt();
		    ArrayList<Integer> res=code(a);
		    for(int h:res){
		        System.out.print(h+" ");
		    }
		    System.out.println();
		    i++;
            sc.close();
		}
	}
    
    public static ArrayList<Integer> code(int arr[]) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:arr){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        ArrayList<ArrayList<Integer>> f=new ArrayList<>();
        for(Map.Entry<Integer,Integer> e:hm.entrySet()){
            ArrayList<Integer> t=new ArrayList<>();
            t.add(e.getValue());
            t.add(e.getKey());
            f.add(t);
        }
        class sortdec implements Comparator<ArrayList<Integer>>{
            public int compare(ArrayList<Integer> a, ArrayList<Integer> b){
                if(a.get(0).equals(b.get(0)))
                    return a.get(1)-b.get(1); //return smallest first
                else
                    return b.get(0)-a.get(0); //return largest first
            }
        }
        Collections.sort(f, new sortdec());
        ArrayList<Integer> ans=new ArrayList<>();
        for(int j=0;j<f.size();j++){
            int v=f.get(j).get(0);
            int k=f.get(j).get(1);
            for(int a=0;a<v;a++)
                ans.add(k);
        }
        return ans;
    }
}
