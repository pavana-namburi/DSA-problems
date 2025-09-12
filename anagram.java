import java.util.*;
public class anagram {
     public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        s1.toLowerCase();
        s2.toLowerCase();
        char a[]=s1.toCharArray();
        char b[]=s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<s1.length();i++){
            if(a[i]!=b[i]){
                System.out.println("not anagram");
                System.exit(0);
            }

        }
        System.out.println("anagram");
        sc.close();
    }
}
