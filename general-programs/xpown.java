import java.util.Scanner;

public class xpown {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element:");
        int x= sc.nextInt();
        System.out.println("enter pow:");
        int n=sc.nextInt();
        System.out.println("x to the power n is: "+xn(x,n));
        sc.close();
    }
    public static int xn(int x,int n){
        int res=1;
        while(n>0){
            if(n%2==0){
                x=x*x;
                n/=2;
            }
            else{
                res*=x;
                n-=1;
            }
        }
        return res;
    }
}
