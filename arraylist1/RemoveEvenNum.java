import java.util.*;

public class RemoveEvenNum {
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
        a.forEach(x -> System.out.print(x+" "));
        a.removeIf(x -> x%2==0);
        System.out.println("\nArrayList after removing even numbers:");
        a.forEach(x -> System.out.print(x+" "));
        sc.close();
    }
}
