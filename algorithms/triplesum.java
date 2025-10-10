import java.util.*;
public class triplesum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.print("enter elements: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("enter target: ");
        int target=sc.nextInt();
        int count=findtriplet(a,n,target);
        if(count>0)
            System.out.print("triplet found count is "+count);
        else
            System.out.print("triplet not found");
        sc.close();
    }
    public static int findtriplet(int a[],int n,int sum){
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(a[i]+a[j]+a[k]==sum)
                        c++;
                }
            }
        }
        return c;
    } 

    /* public static int findtriplet(int a[],int n,int sum){
        int c=0;
        Arrays.sort(a);
        for(int i=0;i<n;i++){
            int l=i+1,h=n-1;
            while(l<h){
                int check=a[i]+a[l]+a[h];
                if(check==sum){
                    c++;l++;h--;
                }
                else if(check<sum)
                    l++;
                else
                    h--;
            }
        }
        return c;
        
    } */

    /* public static int findtriplet(int a[],int n,int sum){
        int c=0;
        for(int i=0;i<n;i++){
            HashSet<Integer> hs=new HashSet<>();
            for(int j=i+1;j<n;j++){
                int check=sum-(a[i]+a[j]);
                if(hs.contains(check))
                    c++;
                hs.add(a[j]);
            }
        }
        return c;
    }  */
}
