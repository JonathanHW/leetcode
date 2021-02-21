/**
 * Given a string s, return the longest palindromic substring in s.
 */
class Solution5 {
    public String longestPalindrome(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        String ans = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j + i < n; j++) {
                int k = j + i;
                if (i == 0) {
                    dp[j][k] = true;
                } else if (i == 1) {
                    dp[j][k] = s.charAt(j) == s.charAt(k);
                } else {
                    dp[j][k] = s.charAt(j) == s.charAt(k) && dp[j + 1][k - 1];
                }
                if (dp[j][k] && i >= ans.length()) {
                    ans = s.substring(j, k + 1);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution5 solution = new Solution5();
        System.out.println(solution.longestPalindrome("abcbc"));
    }
}