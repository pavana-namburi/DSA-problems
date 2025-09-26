import java.util.*;
public class frequency {
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        LinkedHashMap<Character,Integer> s1=new LinkedHashMap<>();
        for(char x:str.toCharArray()){
           s1.put(x,s1.getOrDefault(x,0)+1); 
        }
        Set<Character> st=s1.keySet();
        for(char x:st){
           System.out.println(x+" -> "+s1.get(x)); 
        }
        sc.close();
    }
}
