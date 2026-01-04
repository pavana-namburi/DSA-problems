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
        
         /* System.out.println("Enter k value:");
         int k = sc.nextInt(); */
        
        System.out.print("the no. of subarrays with size <=2 is " + compute(arr, n));
        sc.close();
    }
    public static int compute(int a[], int n) {
        int res = 0,l=1;
        for (int i = 1; i < n; i++) {
            if(a[i]>a[i-1])
                l++;
            else{
                res+=(l*(l-1)/2);
                l=1;
            }
        }
        res+=(l*(l-1)/2);
        return res;
    }

    /* public static int compute(int a[], int n, int k) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            int s = 1;
            for (int j = i; j < n; j++) {
                s *= a[j];
                if (s <= k)
                    res++;
                if (s > k)
                    break;
            }
        }
        return res;
    } */

    /* public static int compute(int a[], int n, int k) {
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
    } */
}
