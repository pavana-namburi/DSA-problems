import java.util.*;

public class slideWinq {
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
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        PriorityQueue<Integer> pq1=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<k;i++){
            pq.offer(a[i]);
            pq1.offer(a[i]);
        }
        int resMIN[]=new int[n-k+1];
        int resMAX[]=new int[n-k+1];
        int gmin=pq.peek(),gmax=pq1.peek();
        resMIN[0]=pq.peek();
        resMAX[0]=pq1.peek();
        for(int i=k;i<n;i++){
            pq.offer(a[i]);
            pq1.offer(a[i]);
            pq.remove(a[i-k]);
            pq1.remove(a[i-k]);
            resMIN[i-k+1]=pq.peek();
            resMAX[i-k+1]=pq1.peek();
            gmin=Math.min(pq.peek(),gmin);
            gmax=Math.max(pq1.peek(),gmax);
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
        System.out.println("min max diff array is: ");
        for(int j=0;j<n-k+1;j++){
            System.out.print(resMAX[j]-resMIN[j]+" ");
        }
    }
}
