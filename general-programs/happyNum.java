import java.util.*;
public class happyNum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number to check happy number or not:");
        int n=sc.nextInt();
        boolean res=isHappy(n);
        if(res){
            System.out.println("the number "+n+" is a Happy Number");
        }
        else{
            System.out.println("the number "+n+" is NOT a Happy Number");
        }
        sc.close();
    }
    public static boolean isHappy(int n){
        HashSet<Integer> hs=new HashSet<>();
        hs.add(n);
        while(true){
            int s=0;
            while(n>0){
                int d=n%10;
                s=s+(d*d);
                n/=10;
            }
            if(s==1)
                return true;
            else if(hs.contains(s))
                return false;
            else{
                hs.add(s);
                n=s;
            }
        }
    }
}
