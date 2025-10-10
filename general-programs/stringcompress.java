import java.util.*;
public class stringcompress {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter string:");
        String s=sc.next();
        String res= encode(s);
        for(int i=0;i<res.length();i++){
            System.out.print(res.charAt(i));
        }
        sc.close();
    }
    public static String encode(String s) {
        StringBuilder sb=new StringBuilder();
        sb.append(s.charAt(0));
        int c=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                c++;
            }
            else{
                sb.append(Integer.toHexString(c));
                sb.append(s.charAt(i)); 
                c=1;
            }
        }
        return  sb.append(Integer.toHexString(c)).toString();
    }
}
