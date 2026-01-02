import java.util.*;

public class anagramss {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String p=sc.nextLine();
        List<Integer> al=compute(s,p);
        System.out.println("the starting indicies are ");
        for(int x:al)
            System.out.print(x+" ");
        sc.close();
    }
    public static List<Integer> compute(String s,String p){
        int n=s.length();
        int m=p.length();
        List<Integer> al=new ArrayList<Integer>();
        if(m>n)
            return al;
        int s1[]=new int[26];
        int p1[]=new int[26];
        for(int i=0;i<m;i++){
            s1[s.charAt(i)-'a']++;
            p1[p.charAt(i)-'a']++;
        }
        if(Arrays.equals(s1,p1))
            al.add(0);
        for(int i=m;i<n;i++){
            s1[s.charAt(i)-'a']++;
            s1[s.charAt(i-m)-'a']--;
            if(Arrays.equals(s1,p1))
                al.add(i-m+1);
        }
        return al;
    }
}
