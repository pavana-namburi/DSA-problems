package sorting;

import java.util.Scanner;

public class mergesort{
    public static void merge(int a[],int l,int m,int r){
        int n1=m-l+1;
        int n2=r-m;
        int x[]=new int[n1];
        int y[]=new int[n2];

        for(int i=0;i<n1;i++){
            x[i]=a[l+i];
        }

        for(int j=0;j<n2;j++){
            y[j]=a[m+j+1];
        }

        int i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(x[i]<=y[j]){
                a[k]=x[i];
                i++;
            }
            else{
                a[k]=y[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            a[k++]=x[i++];
        }
        while(j<n2){
            a[k++]=y[j++];
        }
    }
    public static void mergesorts(int a[],int l,int r){
        if(l<r){
            int m=l+(r-l)/2;
            mergesorts(a,l,m);
            mergesorts(a,m+1,r);
            merge(a,l,m,r);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        mergesorts(arr,0,n-1);
        System.out.println("Sorted elements are: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
     }
}