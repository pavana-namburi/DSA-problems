import java.util.Scanner;
class GCD2
{
     int gcd(int m,int n)
     {
            
             while(m!=n)
             {
                   if(m>n){
                    m=m-n;
                   }
                   else{
                    n=n-m;
                   }
             }
            return m;
      }
}

public class gcd3
{
     public static void main(String args[])
     {
          Scanner sc=new Scanner(System.in);
          System.out.println("enter first number:");
          int m=sc.nextInt();
          System.out.println("enter second number: ");
          int n=sc.nextInt();
          GCD2 g=new GCD2();
          int result = g.gcd(m,n);
         System.out.println("gcd is: "+result);
         sc.close();
     }
}