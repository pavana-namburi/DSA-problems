import java.util.*;
class kmp{
    int[] computrLps(String p){
        int m=p.length();
        int lps[]=new int[m];
        int len=0,i=1;
        while(i<m){
            if(p.charAt(i)==p.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }
            else{
                if(len!=0){
                    len=lps[len-1];
                }
                else{
                    lps[i]=0;
                    i++;
                }
            }
        }
        return lps;
    }
    void KMPSearch(String p,String t){
        int m=p.length();
        int n=t.length();
        int lps[]=computrLps(p);
        int i=0,j=0;
        while(i<n){
            if(p.charAt(j)==t.charAt(i)){
                i++;
                j++;
            }
            if(j==m){
                System.out.println("Found pattern at index "+(i-j));
                j=lps[j-1];
            }
            else if(i<n && p.charAt(j)!=t.charAt(i)){
                if(j!=0){
                    j=lps[j-1];
                }
                else{
                    i++;
                }
            }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the text: ");
        String t=sc.nextLine();
        System.out.print("Enter the pattern: ");
        String p=sc.nextLine();
        kmp k=new kmp();
        k.KMPSearch(p,t);
        sc.close();
    }
}