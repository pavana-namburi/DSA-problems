import java.util.Scanner;

public class lsearch {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int res=linearsearch(arr,n);
        System.out.println("least element: "+res);
        sc.close();
     }
     public static int linearsearch(int arr[],int n){
            for(int j=1;j<n;j++){
                if(arr[j]<arr[j-1])
                    return arr[j];
            }
            return 0;
     }
}
