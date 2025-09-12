import java.util.Scanner;
class GCD1
{
     int gcd(int m,int n)
     {
            
             while(m%n>0)
             {
                   int r=n%m;
                   n=m;
                   m=r;
             }
            return m;
      }
}

public class gcd2
{
     public static void main(String args[])
     {
          Scanner sc=new Scanner(System.in);
          System.out.println("enter first number:");
          int m=sc.nextInt();
          System.out.println("enter second number: ");
          int n=sc.nextInt();
          GCD1 g=new GCD1();
          int result = g.gcd(m,n);
         System.out.println("gcd is: "+result);
         sc.close();
     }
     
}