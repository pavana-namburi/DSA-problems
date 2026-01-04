import java.util.*;
public class slide {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("The smallest substrings with all chars is "+compute(s));
        sc.close();
    }
    public static int compute(String s){
        int n=s.length();
        int res=1000000000;
        HashMap<Character,Integer> hm=new HashMap<>();
        int r=0,l=0;
        while(r<n){
            hm.put(s.charAt(r),hm.getOrDefault(s.charAt(r),0)+1);
            r++;
            
            while(hm.size()==3){
                res=Math.min(res,r-l);
                hm.put(s.charAt(l),hm.get(s.charAt(l))-1);
                if(hm.get(s.charAt(l))==0)
                    hm.remove(s.charAt(l));
                l++;
            }
        }
        return res==1000000000?-1:res;
    }
    /* public static int compute(String s){
        int n=s.length();
        int res=1000000000;
        for(int i=0;i<n;i++){
            HashSet<Character> hs=new HashSet<>();
            for(int j=i;j<n;j++){
                hs.add(s.charAt(j));
                if(hs.size()==3){
                    res=Math.min(res,j-i+1);
                    break;
                }
            }
        }
        return res;
    } */
}
