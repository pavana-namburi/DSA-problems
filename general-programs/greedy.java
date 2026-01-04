import java.util.*;
public class greedy {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.print("enter 1st array elements: ");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int res=compute(a,n);
        System.out.println("the maximum product is: "+res);
        sc.close();
    }
    public static int compute(int a[],int n){
        Arrays.sort(a);
        int p1=a[0]*a[1]*a[n-1];
        int p2=a[n-3]*a[n-2]*a[n-1];
        return Math.max(p1,p2);
    }
    /* public static int compute(int a[],int n,int t){
        Arrays.sort(a);
        int s=0,c=0,i=0;
        while(i<n && s+a[i]<=t){
            s+=a[i];
            c++;
            i++;
        }
        return c;
    } */
    /* public static int compute(int a[],int n){
        Arrays.sort(a);
        int m=a[n/2],c=0;
        for(int i=0;i<n;i++){
            c+=Math.abs(a[i]-m);
        }
        return c;
    } */
    /*public static int compute(int a[],int b[],int n){
        Arrays.sort(a);
        Arrays.sort(b);
        int c=0;
        for(int i=0;i<n;i++)
            c+=Math.abs(a[i]-b[i]);
        return c;
    }*/
}
