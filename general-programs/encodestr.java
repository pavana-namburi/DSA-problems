import java.util.Scanner;

public class encodestr {
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
    public static String encode(String s){
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<s.length()){
            if(i%2==0){
                if(s.charAt(i)=='a')
                    sb.append('z');
                else
                    sb.append((char)(s.charAt(i)-1));
            }
            else{
                if(s.charAt(i)=='z')
                    sb.append('a');
                else
                    sb.append((char)(s.charAt(i)+1));
            }
            i++;
        }
        return sb.toString();
    }
}
