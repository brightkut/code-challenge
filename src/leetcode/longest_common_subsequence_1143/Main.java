package leetcode.longest_common_subsequence_1143;

public class Main {
    public static void main(String[] args) {
        System.out.println(longestCommonSubsequence("abcde","ace"));
    }

    public static int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();

        int [][] arr = new int[m+1][n+1];

        //  a  b  c
        //a 0  0  0
        //b 0
        //c 0
        String res  = "";

        for(int i =0 ; i<=m ; i++){
            for(int j = 0 ; j<=n ; j++){
                if(j==0 || i == 0) arr[i][j] = 0;
                else{
                    if(text1.charAt(i-1) == text2.charAt(j-1)){
                        res+= text1.charAt(i-1);
                        arr[i][j] = arr[i-1][j-1] + 1;
                    }else{
                        arr[i][j] = Math.max(arr[i-1][j],arr[i][j-1]);
                    }
                }
            }
        }
        System.out.println(res);

        return arr[m][n];
    }
}
