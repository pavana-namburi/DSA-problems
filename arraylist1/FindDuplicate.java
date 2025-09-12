import java.util.*;
public class FindDuplicate {
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
        System.out.println("enter element to find repetation:");
        int ele = sc.nextInt();
        int c=0;
        for(int x:a){
            if(x==ele){
                c++;
            }
        }
        if(c>0){
            System.out.println("Element " + ele + " is repeated " + c + " times.");
        } else {
            System.out.println("Element " + ele + " is not found in the ArrayList.");
        }
        sc.close();
    }
}
