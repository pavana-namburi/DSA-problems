import java.util.*;
class biparite{
    public boolean isBipartite(int n, int[][] e) {
        // Code here
        List<List<Integer>> g=getGraph(n,e);
        int col[]=new int[n];
        Arrays.fill(col,-1);
        for(int i=0;i<n;i++){
            if(col[i]==-1){
                if(dfs(i,0,g,col,n)==false)
                    return false;
            }
        }
        return true;
    }
    boolean dfs(int s,int c,List<List<Integer>> g,int col[],int n){
        col[s]=c;
        Stack<Integer> st=new Stack<>();
        st.push(s);
        while(!st.isEmpty()){
            int t=st.pop();
            for(int i:g.get(t)){
                if(col[i]==-1){
                    col[i]=1-c;
                    st.push(i);
                }
                else if(col[i]==col[t])
                    return false;
            }
            c=1-c;
        }
        return true;
    }
    List<List<Integer>> getGraph(int n,int e[][]){
        List<List<Integer>> g=new ArrayList<>();
        for(int i=0;i<n;i++)
            g.add(new ArrayList<>());
        for(int x[]:e){
            int i=x[0],j=x[1];
            g.get(i).add(j);
            g.get(j).add(i);
        }
        return g;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int e[][]=new int[m][2];
        for(int i=0;i<m;i++){
            e[i][0]=sc.nextInt();
            e[i][1]=sc.nextInt();
        }
        biparite obj=new biparite();
        if(obj.isBipartite(n,e))
            System.out.println("Yes");
        else
            System.out.println("No");
        sc.close();
    }
}