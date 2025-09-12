import java.util.*;
public class tm1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter no. of elements:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter elemnets:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        TreeSet<Integer> t1=new TreeSet<>();
        for(int i=0;i<n;i++){
            t1.add(a[i]);
        }
        System.out.println("element are:");
        for(Integer x:t1){
            System.out.print(x+" "); 
        }
        sc.close();
    }
}
