import java.util.*;
class representation {
    int[][] mat;
    int n;
    public representation(int n) {
        mat = new int[n][n];
        this.n=n;
    }

    public void addEdge(int u, int v) {
        mat[u][v] = 1;
        mat[v][u] = 1;
    }

    public void print() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public ArrayList<Integer> dfs(int s,boolean vis[]){
        ArrayList<Integer> al=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        st.push(s);
        while(!st.isEmpty()){
            int u=st.pop();
            if(!vis[u]){
                vis[u]=true;
                al.add(u);
                for(int i=n-1;i>=0;i--){
                    if(mat[u][i]==1 && !vis[i]){
                        st.push(i);
                    }
                }
            }
        }
        return al;
    }

    public void traverse(){
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("1:dfs 2.exit");
            System.out.println("Enter your choice: ");
            int s=sc.nextInt();
            switch(s){
                case 1:     boolean vis[]=new boolean[n];
                            ArrayList<Integer> al=dfs(s,vis);
                            System.out.println(al);
                            break;
                case 2:sc.close();
                    System.exit(0);
            }
        }
    }

}

public class MatRep{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of vertices:");
        int n = sc.nextInt();
        representation g = new representation(n);
        while(true){
            System.out.println("1. Add Edge 2. Print Graph 3. Exit 4.traverse");
            System.out.println("Enter your choice: ");
            int ch= sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter the vertices to add edge:(0 to"+(n-1)+"): ");
                    int u = sc.nextInt();
                    int v = sc.nextInt();
                    g.addEdge(u, v);
                    break;
                case 2:
                    g.print();
                    break;
                case 3:sc.close();
                    System.exit(0);
                case 4:g.traverse();
            }
        }
    }
}