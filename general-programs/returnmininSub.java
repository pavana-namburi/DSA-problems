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
        slide(arr,k,n);
        sc.close();
    }
    public static void slide(int a[],int k,int n){
        int resMIN[]=new int[n-k+1];
        int resMAX[]=new int[n-k+1];
        int gmin=Integer.MAX_VALUE,gmax=Integer.MIN_VALUE;
        for(int i=0;i<=n-k;i++){
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;
            for(int j=i;j<i+k;j++){
                min=Math.min(min,a[j]);
                max=Math.max(max,a[j]);
            }
            resMIN[i]=min;
            resMAX[i]=max;
            gmin=Math.min(min,gmin);
            gmax=Math.max(max,gmax);
        }
        System.out.print("Minimun element of subarrays: ");
        for(int x:resMIN)
            System.out.print(x+" ");
        System.out.println();
        System.out.println("min of minarray is "+gmin);
        System.out.print("Maximun element of subarrays: ");
        for(int x:resMAX)
            System.out.print(x+" ");
        System.out.println();
        System.out.println("max of maxarray is "+gmax);
    }
}
