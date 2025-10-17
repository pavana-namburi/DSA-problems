import java.util.*;
public class strencode {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter String to encode:");
        String s=sc.next();
        String res=encode(s);
        System.out.println("The Encoded String is: "+res);
        sc.close();
    }
    public static String encode(String s){
	StringBuilder sb=new StringBuilder();
	int c=1;
	int i=1;
	for(i=1;i<s.length();i++){
		if(s.charAt(i)==s.charAt(i-1)){
			c++;
		}
		else{
			sb.append('[');
			sb.append(c);
			sb.append(']');
			sb.append(s.charAt(i-1));
			c=1;
		}
			
	}
	sb.append('[');
	sb.append(c);
	sb.append(']');
	sb.append(s.charAt(i-1));
	return sb.toString();
    }
}