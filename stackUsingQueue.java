import java.util.*;

public class stackUsingQueue {
    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();

    public void push(int x) {
        q2.offer(x);
        while (!q1.isEmpty()) {
            q2.offer(q1.poll());
        }
        Queue<Integer> t = q1;
        q1 = q2;
        q2 = t;
    }

    public int pop() {
        if (!q1.isEmpty()) {
            return q1.poll();
        }
        return -1;
    }

    public int top() {
        if (!q1.isEmpty()) {
            return q1.peek();
        }
        return -1;
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}

class stackUsingQueue1 {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    // O(1) - Just add to q1
    public void push(int x) {
        q1.offer(x);
    }

    // O(n) - Move elements to get the last one
    public int pop() {
        if (q1.isEmpty()) return -1;

        // Leave only 1 element in q1
        while (q1.size() > 1) {
            q2.offer(q1.poll());
        }

        // This is the element to "pop"
        int topElement = q1.poll();

        // Swap queues so q1 is ready for more pushes
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return topElement;
    }

    // O(n) - Similar to pop but we put the element back
    public int top() {
        if (q1.isEmpty()) return -1;

        while (q1.size() > 1) {
            q2.offer(q1.poll());
        }

        int topElement = q1.peek(); // Get the last element
        q2.offer(q1.poll());        // Move it to q2 instead of deleting

        // Swap back
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return topElement;
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}


class Main {
    public static void main(String[] args) {
        stackUsingQueue st= new stackUsingQueue();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1: Push 2:Pop 3:peek 4:isEmpty 5:exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1: System.out.print("Enter element to insert: ");
                        int x=sc.nextInt();
                        st.push(x);
                        break;
                case 2: int d=st.pop();
                        System.out.println("The deleted elements is: "+d);
                        break;
                case 3: int y=st.top();
                        System.out.println("The top elements is: "+y);
                        break;
                case 4: if(st.empty())
                            System.out.println("The stack is Empty");
                        else
                            System.out.println("the stack is not empty");
                        break;
                case 5: sc.close();
                        System.exit(0);
            }
        }
    }
}
