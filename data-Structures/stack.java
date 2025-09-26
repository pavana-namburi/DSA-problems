import java.util.*;

public class stack {
    public static void main(String args[]){
        Queue<Integer> s = new LinkedList<>();
        for(int i=1;i<=10;i++){
            s.add(i);
        }
        s.stream().forEach(x-> System.out.print(x + " "));
    }
}