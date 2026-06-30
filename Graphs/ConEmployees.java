import java.util.*;

public class ConEmployees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dsu[] = getDSU(n);
        int size[] = new int[n + 1];
        Arrays.fill(size, 1);
        while (true) {
            System.out.println("1:connect 2:query");
            int x = sc.nextInt();
            if (x == 1) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                union(a, b, dsu, size);
            } else if (x == 2) {
                int a = sc.nextInt();
                System.out.println(size[find(a, dsu)]);
            } else {
                sc.close();
                break;
            }
        }

    }

    static int[] getDSU(int n) {
        int dsu[] = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            dsu[i] = i;
        }
        return dsu;
    }

    static int find(int i, int dsu[]) {
        if (i == dsu[i])
            return i;
        return find(dsu[i], dsu);
    }

    static void union(int i, int j, int dsu[], int size[]) {
        int i1 = find(i, dsu);
        int j1 = find(j, dsu);
        if (i1 != j1) {
            dsu[i1] = j1;
            size[j1] += size[i1];
        }
    }
}
