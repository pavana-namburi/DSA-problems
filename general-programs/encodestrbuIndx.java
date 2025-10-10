import java.util.Scanner;

public class encodestrbuIndx {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter string:");
        String s=sc.next();
        int r=sc.nextInt();
        String res= encode(s,r);
        for(int i=0;i<res.length();i++){
            System.out.print(res.charAt(i));
        }
        sc.close();
    }
    public static String encode(String s,int r){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char x=(char)((s.charAt(i)+r));
            if(x>'z'){
                sb.append((char)('a'+(x-'z')-1));
            }
            else
                sb.append(x);
        }
        return sb.toString();
    }
}
