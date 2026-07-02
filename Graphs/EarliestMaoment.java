import java.util.*;
public class EarliestMaoment {
    public int earliestAcq(int[][] logs, int n) {
        // code here
        int dsu[]=getDSU(n);
        Arrays.sort(logs,(a,b)->a[2]-b[2]);
        for(int x[]:logs){
            int i=x[0],j=x[1];
            int i1=find(i,dsu),j1=find(j,dsu);
            if(i1!=j1){
                dsu[i1]=j1;
                n--;
            }
            if(n==1)
                return x[2];
        }
        return -1;
    }
    int[] getDSU(int n){
        int dsu[]=new int[n];
        for(int i=0;i<n;i++)
            dsu[i]=i;
        return dsu;
    }
    int find(int i,int dsu[]){
        if(i==dsu[i])
            return i;
        return find(dsu[i],dsu);
    }
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int logs[][]=new int[m][3];
        for(int i=0;i<m;i++){
            logs[i][0]=sc.nextInt();
            logs[i][1]=sc.nextInt();
            logs[i][2]=sc.nextInt();
        }
        EarliestMaoment obj=new EarliestMaoment();
        System.out.println(obj.earliestAcq(logs,n));
        sc.close();
    }
}