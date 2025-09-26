import  java.util.*;
public class TwoPointer {
    public static void main(String arg[]){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
       int[] ans=method(arr,n);
         if(ans[0]!=-1 && ans[1]!=-1){
              System.out.println("elements found: "+ans[0]+" "+ans[1]);
         }
         else{
              System.out.println("elements not found");
         }
        sc.close();
    }
    static int[] method(int arr[],int n){
        int t=0;
        int i=0,j=n-1;
        while(i<j){
            if(arr[i]+arr[j]==t){
                return new int[]{i,j};
            }
            else if(arr[i]+arr[j]<t){
                i++;
            }
            else{
                j--;
            }
        }
        return new int[]{-1,-1};
    }
}

