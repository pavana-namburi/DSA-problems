import java.util.Scanner;

public class MergwTwoArrays {
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
        int arr3[]=new int[n1+n2];
        arr3=mergeArrays(arr1,arr2,n1,n2);
         System.out.println("merged array:");
        for(int l=0;l<arr3.length;l++){
            System.out.print(arr3[l]+" ");
        }
        sc.close();
    }
    static int[] mergeArrays(int arr1[], int arr2[], int m, int n){
        int arr3[]=new int[m+n];
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(arr1[i]<arr2[j]){
                arr3[k++]=arr1[i++];
            }
            else{
                arr3[k++]=arr2[j++];
            }
        }
        while(i<m){
            arr3[k++]=arr1[i++];
        }
        while(j<n){
            arr3[k++]=arr2[j++];
        }
        return arr3;
    }
}
