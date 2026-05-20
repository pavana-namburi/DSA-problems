/* You have a source pattern and a target string, figure out how many ways you could get the source pattern in the target string as a subsequence if you cannot take consecutive characters (PS: loosely worded but hope the example below makes sense). Example:

Source: abc
Target: abbccc

Answer - 2 (abbccc, abbccc)

abbccc
0  2  4
abbccc
0  2    5 */



import java.util.*;
public class subsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a source string: ");
        String str = sc.nextLine();
        System.out.println("enter a target: ");
        String sub = sc.nextLine();
        int[][] dp = new int[str.length() + 1][sub.length() + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        int ways=findway(str,sub,0,0,dp);
        System.out.println("number of ways: "+ways);
        sc.close();
    }
    static int findway(String src,String t,int i,int j,int dp[][]){
        if(i>=src.length())
            return 1;
        if(j>=t.length())
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        int ways=0;
        ways+=findway(src,t,i,j+1,dp);
        if(src.charAt(i)==t.charAt(j))
            ways+=findway(src,t,i+1,j+2,dp);
        dp[i][j]=ways;
        return ways;
    }
}