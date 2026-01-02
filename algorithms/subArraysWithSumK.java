import java.util.*;

public class subArraysWithSumK {
    public static void main(String args[]) {
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
        System.out.print("the no. of subarrays with product <= " + k + " is " + compute(arr, n, k));
        sc.close();
    }

    /*
     * public static int compute(int a[],int n,int k){
     * int res=0;
     * for(int i=0;i<n;i++){
     * int s=1;
     * for(int j=i;j<n;j++){
     * s*=a[j];
     * if(s<=k)
     * res++;
     * if(s>k)
     * break;
     * }
     * }
     * return res;
     * }
     */
    public static int compute(int a[], int n, int k) {
        int res = 0;
        int s = 1, j = 0;
        for (int i = 0; i < n; i++) {
            s *= a[i];
            while (s > k) {
                s /= a[j];
                j++;
            }
            res += (i - j + 1);

        }
        return res;
    }
}
