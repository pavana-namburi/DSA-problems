import java.util.*;

public class Activity {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s[] = new int[n];
        int f[] = new int[n];
        for (int i = 0; i < n; i++)
            s[i] = sc.nextInt();
        for (int j = 0; j < n; j++)
            f[j] = sc.nextInt();
        int res = compute(s, f, n);
        System.out.println("The total number of activities are: " + res);
        sc.close();
    }
    private static int compute(int[] s,int[] f, int n){
        PriorityQueue<int[]> pq=new PriorityQueue<>((x,y)->x[1]-y[1]);
        for(int i=0;i<n;i++){
            pq.add(new int[]{s[i],f[i]});
        }
        int c=0,j=-1;
        while(!pq.isEmpty()){
           int[] z=pq.poll();
           if(z[0]>j){
                c++;
                j=z[1];
           }
        }
        return c;
    }

    /* private static int compute(int[] s,int[] f, int n){
        int[][] a=new int[n][2];
        for(int i=0;i<n;i++){
            a[i][0]=s[i];
            a[i][1]=f[i];
        }
        Arrays.sort(a,(x,y)->x[1]-y[1]);
        int c=1,j=0,i=1;
        while(i<n){
            if(a[i][0]>a[j][1]){
                c++;
                j=i;
            }
            i++;
        }
        return c;
    } */
}
