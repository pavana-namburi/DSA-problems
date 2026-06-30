import java.util.*;
public class disconnectDFS {
    public List<Integer> dfs(int n, List<List<Integer>> g) {
        List<Integer> res=new ArrayList<>();
        boolean vis[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                dfsi(i,g,vis,res);
            }
        }
        return res;
    }

    public List<List<Integer>> getcomponents(int n, List<List<Integer>> g) {
        List<List<Integer>> res=new ArrayList<>();
        boolean vis[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                List<Integer> al=new ArrayList<>();
                dfsi(i,g,vis,al);
                res.add(al);
            }
        }
        return res;
    }

    public void dfs1(int s,List<List<Integer>> g,boolean vis[],List<Integer> res){
        vis[s]=true;
        res.add(s);
        for(int v:g.get(s)){
            if(!vis[v]){
                dfs1(v,g,vis,res);
            }
        }
    }

    public List<Integer> dfsi(int s,List<List<Integer>> g,boolean vis[],List<Integer> res){
        Stack<Integer> st=new Stack<>();
        st.push(s);
        while(!st.isEmpty()){
            int u=st.pop();
            if(!vis[u]){
                vis[u]=true;
                res.add(u);
                for(int v:g.get(u)){
                    if(!vis[v]){
                        st.push(v);
                    }
                }
            }
        }
        return res;
    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of vertices:");
        int n = sc.nextInt();
        List<List<Integer>> g = new ArrayList<>();
        for(int i=0;i<n;i++)
            g.add(new ArrayList<>());
        System.out.println("Enter the number of edges:");
        int e=sc.nextInt();
        System.out.println("Enter the edges:");
        for(int i=0;i<e;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            g.get(u).add(v);
            g.get(v).add(u);
        }
        disconnectDFS obj=new disconnectDFS();
        List<Integer> res=obj.dfs(n,g);
        System.out.print("DFS Traversal of the graph: ");
        System.out.println(res);
        List<List<Integer>> components=obj.getcomponents(n,g);
        System.out.println("Connected components of the graph: ");
        for(List<Integer> component:components){
            System.out.println(component);
        }
        sc.close();
    }
}
