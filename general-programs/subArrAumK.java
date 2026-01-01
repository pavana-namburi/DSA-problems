import java.util.*;

public class subArrAumK {
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
        int b[]=slide(arr,k,n);
        for(int x=b[0];x<b[1];x++){
            System.out.print(arr[x]+" ");
        }
        sc.close();
    }
    public static int[] slide(int a[],int k,int n){
        int max=0;
        int res[]=new int[2];
        for(int i=0;i<n;i++){
            int s=0;
            for(int j=i;j<n;j++){
                s+=a[j];
                if(s==k){
                    int len=j-i+1;
                    if(len>max){
                        max=len;
                        res[0]=i;
                        res[1]=j+1;
                    }
                }
            }
        }
        return res;
    }

}
