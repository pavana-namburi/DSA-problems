import java.util.*;
public class fabinocci {
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        System.out.print("prev num is:"+fab(n));
        sc.close();
    }
    /*  public static boolean fab(int n){
        int a= 5*n*n-4;
        int b= 5*n*n+4;
        boolean x= Math.floor(Math.sqrt(a)) == Math.ceil(Math.sqrt(a));
        boolean y= Math.floor(Math.sqrt(b)) == Math.ceil(Math.sqrt(b));
        if(x||y)
            return true;
        return false;
    }*/
    public static int fab(int n){
        double p = (1+ Math.sqrt(5))/2.0;
        double a=n/p;
        return (int)Math.round(a);
    }
    
}
