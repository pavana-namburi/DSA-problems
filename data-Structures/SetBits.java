import java.util.Scanner;
public class SetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Example number
        System.out.println("Number of set bits in " + n + " is: " + countSetBits(n));
        sc.close();
    }

    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if(n%2!=0){
                count++;
            }
            n = n / 2;
        }
        return count;
    }
}

/*
 * while(n>0){
 * if(n&1==1){ // Checks if the last bit is set
 *   count++;
 * }
 *   n>>=1;
 * }
 */