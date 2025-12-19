import java.util.Scanner;

public class countInvertPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int res=mergesorts(arr,0,n-1);
        System.out.println("Inversion count is: "+res);
        sc.close();
    }
    /*public static int cfun(int a[],int n){
        int c=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j])
                    c++;
            }
        }
        return c;
    }*/
    public static int merge(int a[],int l,int m,int r){
        int res=0;
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
                res+=(n1-i);
            }
            k++;
        }
        while(i<n1){
            a[k++]=x[i++];
        }
        while(j<n2){
            a[k++]=y[j++];
        }
        return res;
    }
    public static int mergesorts(int a[],int l,int h){
        int r=0;
        if(l<h){
            int m=l+(h-l)/2;
            r+=mergesorts(a,l,m);
            r+=mergesorts(a,m+1,h);
            r+=merge(a,l,m,h);
        }
        return r;
    }
}
