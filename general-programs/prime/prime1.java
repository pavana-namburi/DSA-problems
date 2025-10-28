import java.util.Scanner;
public class prime1 {
    public static void main(String[] args) {
        // Your code goes here
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int a=sc.nextInt();
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
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                
                x++;
            }
        }
        if(x> 2) {
            return false;
        }
        return true;
    }
}