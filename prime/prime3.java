import java.util.*;
public class prime3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int a = sc.nextInt();
        if (isPrime(a)) {
            System.out.println(a + " is a prime number.");
        } else {
            System.out.println(a + " is not a prime number.");
        }
        sc.close();
    }

    public static boolean isPrime(int n) {
        int x = 0;
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i*i <=n; i++) {
            if (n % i == 0) {
                x++;
                if(i!=n/i){
                    x++; // Count both divisors
                }
            }
        }
        if (x > 0) {
            return false;
        }
        else{
            return true;
        }
        
    }
}
