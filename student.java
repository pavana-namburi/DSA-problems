import java.util.*;

class stu {
    String name;
    double cgpa;
    int id;

    stu(String s, double c, int i) {
        name = s;
        cgpa = c;
        id = i;
    }
}

public class student {
    static PriorityQueue<stu> pq = new PriorityQueue<>(Comparator.comparingDouble((stu x) -> x.cgpa).reversed()
            .thenComparing(x -> x.name).thenComparing(x -> x.id));

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your choice: ");
            System.out.println("1:Enter 2:Served 3:Exit");
            int ch = sc.nextInt();
            if (ch == 1) {
                enter(sc);
            } else if (ch == 2) {
                served();
            } else
                break;
        }
        for(stu x:pq){
            System.out.println(x.name);
        }
        sc.close();
    }

    static void enter(Scanner sc) {
        sc.nextLine();
        System.out.print("Enter name: ");
        String s = sc.nextLine();
        System.out.print("Enter cgpa: ");
        double c = sc.nextDouble();
        System.out.print("Enter id: ");
        int i = sc.nextInt();
        pq.add(new stu(s, c, i));
    }

    static void served() {
        if (pq.isEmpty()) {
            System.out.println("No students in queue.");
        } else {
            stu s = pq.poll();
            System.out.println("Served: " + s.name);
        }
    }
}