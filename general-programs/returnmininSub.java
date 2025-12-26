import java.util.*;

public class returnmininSub {
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
    public static int[] slide(int a[],int k,int n){
        int res[]=new int[n-k+1];
        for(int i=0;i<=n-k;i++){
            HashSet<Integer> hs=new HashSet<>();
            for(int j=i;j<i+k;j++){
                hs.add(a[j]);
            }
            res[i]=hs.size();
        }
        return res;
    }
}
