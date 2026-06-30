import java.util.*;
class floodFill{
    static int[][] floodFills(int[][] image, int sr, int sc, int newColor) {
        // code here
        int old=image[sr][sc];
        int n=image.length,m=image[0].length;
        dfs(sr,sc,newColor,old,image,n,m);
        return image;
    }
    static void dfs(int i,int j,int nc,int old,int image[][],int n,int m){
        if(i<0 || i>=n || j<0 || j>=m || image[i][j]!=old)
            return;
        if(image[i][j]==nc)
            return;
        image[i][j]=nc;
        dfs(i-1,j,nc,old,image,n,m);
        dfs(i,j-1,nc,old,image,n,m);
        dfs(i,j+1,nc,old,image,n,m);
        dfs(i+1,j,nc,old,image,n,m);
    }
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int image[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                image[i][j]=sc.nextInt();
            }
        }
        int sr=sc.nextInt();
        int sc1=sc.nextInt();
        int newColor=sc.nextInt();
        int ans[][]=floodFills(image,sr,sc1,newColor);
        for(int x=0;x<n;x++){
            for(int y=0;y<m;y++){
                System.out.print(ans[x][y]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
