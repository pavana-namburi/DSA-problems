import java.util.Scanner;

public class fixedSlidingWindow {
    /* Brute Force:
    public static int[] slide(int a[],int k,int n){
        int res[]=new int[n-k+1];
        for(int i=0;i<=n-k;i++){
            int s=0;
            for(int j=i;j<i+k;j++){
                s+=a[j];
            }
            res[i]=s;
        }
        return res;
    }*/
    public static int[] slide(int a[],int k,int n){
        int res[]=new int[n-k+1];
        int s=0;
        for(int i=0;i<k;i++)
            s+=a[i];
        res[0]=s;
        /*for(int j=1;j<=n-k;j++){
            s+=a[j+k-1];
            s-=a[j-1];
            res[j]=s;
        }*/
        for(int j=k;j<n;j++){
            s+=a[j];
            s-=a[j-k];
            res[j-k+1]=s;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter k value:");
        int k = sc.nextInt();
        int ans[]=slide(arr,k,n);
        for(int x:ans)
            System.out.print(x+" ");
        sc.close();
    }
}
