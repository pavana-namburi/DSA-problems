import java.util.*;
public class power2 {
    public static void main(String[] args) {
        System.out.print("enter number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if((n & (n-1)) == 0){
            System.out.println(n + " is a power of 2");
        } else {
            System.out.println(n + " is not a power of 2");
        }
        sc.close();
    }
}
