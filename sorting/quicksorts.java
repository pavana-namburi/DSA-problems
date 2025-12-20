package sorting;

import java.util.Scanner;

public class quicksorts {
    /*public static int partition(int a[],int l,int r){
        int pi=a[r];
        int i=l-1;
        for(int j=l;j<r;j++){
            if(a[j]<=pi){
                i++;
                swap(a,i,j);
            }
        }
        swap(a,i+1,r);
        return i+1;
    }*/
    public static int partition(int a[],int l,int r){
        int pi=a[l];
        int i=l-1,j=r+1;
        while(true){
            do{
                i++;
            }while(a[i]<pi);
            do{
                j--;
            }while(a[j]>pi);
            if(i<j){
                swap(a,i,j);
            }
            else 
                return j;
        }
    }
    public static void swap(int a[],int i,int j){
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
    public static void quicksort(int a[],int l,int r){
        if(l<r){
            int p= partition(a,l,r);
            quicksort(a,l,p);
            quicksort(a,p+1,r);
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
        quicksort(arr,0,n-1);
        System.out.println("Sorted elements are: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
     }
}
