/* import java.util.*;

public class RemoveDupTwoPointer {
    String removeDup(String s) {
        if (s.isEmpty()) return "";
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1))
                sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String s = sc.next();

        RemoveDupTwoPointer obj = new RemoveDupTwoPointer();
        System.out.println(obj.removeDup(s));
        sc.close();
    }
} 
    */

import java.util.*;

public class RemoveDupStack {
    String removeDup(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!st.isEmpty() && st.peek() == c) continue;
            st.push(c);
        }
        StringBuilder sb = new StringBuilder();
        for (char c : st) sb.append(c);
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String s = sc.next();

        RemoveDupStack obj = new RemoveDupStack();
        System.out.println(obj.removeDup(s));
        sc.close();
    }
}

