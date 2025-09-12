import java.util.Scanner;

public class userdefinedmap {
     public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int a[]=new int[26];
        str.toLowerCase();
        for(char x:str.toCharArray()){
           a[x-'a']++; 
        }
        for(char i:str.toCharArray()){
            if(a[i-'a']!=0){
                 System.out.println(i +" -> "+ a[i-'a']);
                 a[i-'a']=0;
            }
        }
        
        sc.close();
    }
}
