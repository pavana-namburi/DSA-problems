import java.util.Scanner;
class GCD
{
     int gcd(int m,int n)
     {
              int r=Math.min(m,n);
             while(r>0)
             {
                   if(m%r==0 && n%r==0) 
                       return r;
                   r--;
             }
            return 1;
      }
}

public class gcd1
{
     public static void main(String args[])
     {
          Scanner sc=new Scanner(System.in);
          System.out.println("enter first number:");
          int m=sc.nextInt();
          System.out.println("enter second number: ");
          int n=sc.nextInt();
          GCD g=new GCD();
          int result = g.gcd(m,n);
         System.out.println("gcd is: "+result);
         sc.close();
     }
}