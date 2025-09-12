import java.util.Scanner;

public class findunique {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char a[]=new char[n];
        for(int i=0;i<n;i++){
            a[i]=sc.next().charAt(0);
        }
        int ans=0;
        for(char x:a){
            ans^=x;
        }
        System.out.println("unique is "+(char)ans);
        sc.close();
    }
}
