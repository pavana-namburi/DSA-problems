import java.util.*;

public class al6 {
    public static void main(String args[]){
        ArrayList<Integer> a=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the ArrayList6:");
        int n=sc.nextInt();
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            a.add(sc.nextInt());
        }
        System.out.println("ArrayList elements are:");
        a.forEach(x -> System.out.print(x + " "));
        sc.close();
    }
}
