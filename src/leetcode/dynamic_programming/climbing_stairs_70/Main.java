package leetcode.dynamic_programming.climbing_stairs_70;

public class Main {
    public static void main(String[] args) {

    }

    public int climbStairs(int n) {
        // approach you can pace only 2 step that if stairs have more than 2 step
        // it will increase from old step

        if(n==1) return 1;
        if(n==2) return 2;

        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;


        for(int i = 2; i <= n ; i++) dp[i] = dp[i-1] + dp[i-2];

        return dp[n];
    }
}
