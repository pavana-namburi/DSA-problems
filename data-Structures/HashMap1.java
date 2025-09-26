import java.util.*;
public class HashMap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter elemnets:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        HashMap<Integer, Integer> hm1 = new HashMap<>();
        for(int i=0;i<n;i++){
                hm1.put(a[i], hm1.getOrDefault(a[i], 0) + 1);
        }
        System.out.println("Enter the frequancy:");
        int k=sc.nextInt();
        Set <Integer> s1= hm1.keySet();
        System.out.println("ele\tcount");
        for(int x:s1) {
            if (hm1.get(x) == k) {
                System.out.println(x+ "\t"+ hm1.get(x));
            }
        }
        sc.close();
    }
}


    

