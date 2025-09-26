import java.util.*;

public class findunique {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s.toLowerCase();
        HashSet<Character> hs=new HashSet<>();
        for(char i:s.toCharArray()){
            if(!hs.contains(i))
                hs.add(i);
            else{
                System.out.println("not isogram");
                System.exit(0);
            }
        }
        System.out.println("isogram");
        sc.close();
    }
}
