/*import java.util.Scanner;
public class divisibility{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String n = sc.next();
        if(div2(n) && div3(n)){
            System.out.println("divisible by 6");
        }
        else{
            System.out.println("not divisible by 6");
        }
        sc.close();
    }
    static boolean div2(String n){
        int s=n.charAt(n.length()-1);
        if(s=='0' || s=='2' || s=='4' || s=='6' || s=='8'){
            return true;
        }
        else{
            return false;
        }
    }
    static boolean div3(String n) {
        int sum = 0;
        for (int i = 0; i < n.length(); i++) {
            sum += n.charAt(i) - '0'; // convert char digit to int
        }

        if (sum % 3 == 0) {
            return true;
        } else {
            return false;
        }
    }
} */


/* 
import java.util.Scanner;

public class divisibility{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String n = sc.next();
        int s=n.charAt(n.length()-1)-'0';
        int s1=n.charAt(n.length()-2)-'0';
        int num=(s*10)+s1;
        if(num%4==0){
            System.out.println("divisible by 4");
        }
        else{
           System.out.println("not divisible by 4"); 
        }
        sc.close();
    }
}   */



import java.util.Scanner;

public class divisibility{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        
        
        sc.close();
    }
}