import java.util.*;
class listrep{
    List<List<Integer>> g;
    int n;
    listrep(int n){
        this.n=n;
        g=new ArrayList<>();
        for(int i=0;i<n;i++)
            g.add(new ArrayList<>());
    }

    public void addedge(int u,int v){
        g.get(u).add(v);
        g.get(v).add(u);
    }

    public void display(){
        for(int i=0;i<n;i++){
            System.out.print(i+"- ");
            for(int x:g.get(i))
                System.out.print(x+" ");
            System.out.println();
        }
    }

    public void dfs(int s,boolean vis[],ArrayList<Integer> al){
        al.add(s);
        vis[s]=true;
        for(int v:g.get(s)){
            if(!vis[v]){
                dfs(v,vis,al);
            }
        }
    }

    public ArrayList<Integer>  bfs(int s,boolean vis[],ArrayList<Integer> al){
        Queue<Integer> q=new LinkedList<>();
        q.add(s);
        vis[s]=true;
        while(!q.isEmpty()){
            int u=q.poll();
            al.add(u);
            for(int v:g.get(u)){
                if(!vis[v]){
                    q.add(v);
                    vis[v]=true;
                }
            }
        }
        return al;
    }

}

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of vertices:");
        int n = sc.nextInt();
        listrep g = new listrep(n);
        while(true){
            System.out.println("1. Add Edge 2. Print Graph 3. Exit 4. DFS 5. BFS");
            System.out.println("Enter your choice: ");
            int ch= sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter the vertices to add edge:(0 to"+(n-1)+"): ");
                    int u = sc.nextInt();
                    int v = sc.nextInt();
                    g.addedge(u, v);
                    break;
                case 2:
                    g.display();
                    break;
                case 3:sc.close();
                    System.exit(0);
                case 4:System.out.println("Enter the starting vertex for DFS:(0 to"+(n-1)+"): ");
                    int s=sc.nextInt();
                    boolean vis[]=new boolean[n];
                    ArrayList<Integer> al=new ArrayList<>();
                    g.dfs(s,vis,al);
                    System.out.println(al);
                    break;
                case 5:System.out.println("Enter the starting vertex for BFS:(0 to"+(n-1)+"): ");
                    int s1=sc.nextInt();
                    boolean vis1[]=new boolean[n];
                    ArrayList<Integer> al1=new ArrayList<>();
                    g.bfs(s1,vis1,al1);
                    System.out.println(al1);
                    break;
            }
        }
    }
}