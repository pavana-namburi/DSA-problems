import java.util.*;

public class al1 {
    public static void main(String args[]){
        ArrayList<Integer> a=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the ArrayList:");
        int n=sc.nextInt();
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            a.add(sc.nextInt());
        }
        System.out.println("ArrayList elements are:");
        for(int i=0;i<a.size();i++){
            System.out.print(a.get(i)+" ");
        }
        sc.close();
    }
}
