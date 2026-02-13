class Solution {
    public long solution(int n) {
        long mod = 1234567;
        
        if (n <= 2) return n;
        
        long a = 1;  // dp[1]
        long b = 2;  // dp[2]
        
        for (int i = 3; i <= n; i++) {
            long temp = (a + b) % mod;
            a = b;
            b = temp;
        }
        
        return b;
    }
}
