import java.util.*;

public class findunique {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        HashSet<Character> hs=new HashSet<>();
        for(char i:s.toCharArray()){
            hs.add(i);
        }
        if(hs.size()==26){
            System.out.println("panagram");
        }
        else{
            System.out.println(" not panagram");
        }
        sc.close();
    }
}
