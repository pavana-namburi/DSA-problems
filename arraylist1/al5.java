import java.util.*;

public class al5{
    public static void main(String args[]){
        ArrayList<Integer> a=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the ArrayList5:");
        int n=sc.nextInt();
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            a.add(sc.nextInt());
        }
        System.out.println("ArrayList elements are:");
        Enumeration<Integer> x=Collections.enumeration(a);
        while(x.hasMoreElements()){
            System.out.print(x.nextElement()+" ");
        }
        sc.close();
    }
}
