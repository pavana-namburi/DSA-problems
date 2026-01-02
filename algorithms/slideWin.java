import java.util.*;
public class slideWin {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("The longest substrings with unique chars is "+compute(s));
        sc.close();
    }
    /*public static int compute(String s){
        int n=s.length(),res=0;
        boolean f[]=new boolean[26];
        int l=0;
        for(int r=0;r<n;r++){
            while(f[s.charAt(r)-'a']){
                f[s.charAt(l)-'a']=false;
                l++;
            }
            f[s.charAt(r)-'a']=true;
            res=Math.max(res,(r-l+1));
        }
        return res;
    }*/
    public static int compute(String s){
        int n=s.length();
        int res=0;
        for(int i=0;i<n;i++){
            HashSet<Character> hs=new HashSet<>();
            for(int j=i;j<n;j++){
                if(hs.contains(s.charAt(j)))
                    break;
                hs.add(s.charAt(j));
                res=Math.max(res,hs.size());
            }
        }
        return res;
    }
}
