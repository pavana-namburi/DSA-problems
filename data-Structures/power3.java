import java.util.Scanner;
public class power3 {
    public static boolean isPowerOfThree(int n) {
        if (n <= 0) return false; 
        while (n % 4 == 0) {
            n /= 4;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (isPowerOfThree(num)) {
            System.out.println(num + " is a power of 4");
        } else {
            System.out.println(num + " is NOT a power of 4");
        }
        sc.close();
    }
}
