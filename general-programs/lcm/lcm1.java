import java.util.Scanner;
class lcm
{
    int LCM(int m ,int n)
    {
      gcd g=new gcd();
      int res=g.gcd1(m,n);
      return (m*n)/res;
    }
}

class gcd{
      int gcd1(int m,int n)
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

public class lcm1
{
     public static void main(String args[])
     {
          Scanner sc=new Scanner(System.in);
          System.out.println("enter first number:");
          int m=sc.nextInt();
          System.out.println("enter second number: ");
          int n=sc.nextInt();
          lcm l=new lcm();
          int result = l.LCM(m,n);
         System.out.println("lcm is: "+result);
         sc.close();
     }
}