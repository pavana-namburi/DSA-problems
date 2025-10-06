import java.util.*;
public class mergeTwoArrays {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int arr1[]=new int[n1];
        int arr2[]=new int[n2];
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        mergeArrays(arr1,arr2,n1,n2);
        System.out.println("After merging:");
        System.out.println("Array 1:");
        for(int i=0;i<n1;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println("\nArray 2:");
        for(int i=0;i<n2;i++){
            System.out.print(arr2[i]+" ");
        }
        sc.close();
    }
    static void mergeArrays(int arr1[], int arr2[], int m, int n){
        int arr3[]=new int[m+n];
        int k=0;
        for(int s=0;s<m;s++){
            arr3[k++]=arr1[s];
        }
        for(int p=0;p<n;p++){
            arr3[k++]=arr2[p];
        }
        Arrays.sort(arr3);
        for(int x=0;x<m;x++){
            arr1[x]=arr3[x];
        }
        for(int x=0;x<n;x++){
            arr2[x]=arr3[m+x];
        }
    }
}
