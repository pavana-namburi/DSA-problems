import java.util.*;
public class countPath {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("the "+n+"th fibinnoci number is "+compute(n) );
        sc.close();
    }
    public static int compute(int n){
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else
            return compute(n-1);
    }
}
