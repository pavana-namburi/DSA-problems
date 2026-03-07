import java.util.*;

public class ReverseQueue {
    public static void reverseRecursively(Queue<Integer> q) {
        if (q.isEmpty()) return;
        int x = q.poll();
        reverseRecursively(q);
        q.add(x);
    }

    public static void reverseWithStack(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();
        while (!q.isEmpty()) {
            s.push(q.poll());
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println("Original Queue: " + q);

        reverseRecursively(q);
        System.out.println("After Recursion: " + q);

        reverseWithStack(q);
        System.out.println("After Stack (Back to Original): " + q);
    }
}

