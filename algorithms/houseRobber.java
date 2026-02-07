import java.util.*;
public class houseRobber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of houses: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter amount in each house: ");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.println("the maximum amount can be steal is: "+compute(a,n-1));
        sc.close();
    }
    public static int compute(int a[],int n){
        if(n < 0) return 0;
        if(n==0) return a[0];
        
        return Math.max(a[n] + compute(a, n-2), compute(a, n-1));
    }
    /* public static int compute(int a[],int n){
        int dp[]=new int[n];
        dp[0]=a[0];dp[1]=Math.max(a[0],a[1]);
        for(int i=2;i<n;i++)
            dp[i]=Math.max(dp[i-2]+a[i],dp[i-1]);
        return dp[n-1];
    } */
}
