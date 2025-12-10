class Solution {
    public int countPermutations(int[] complexity) {
        final int MOD = 1_000_000_007;
        int n = complexity.length;

        // Check if all computers (1..n-1) can be unlocked by computer 0
        for (int i = 1; i < n; i++) {
            if (complexity[i] <= complexity[0]) {
                // This computer can never be unlocked
                return 0;
            }
        }

        // Compute (n - 1)! % MOD
        long ans = 1;
        for (int i = 1; i <= n - 1; i++) {
            ans = (ans * i) % MOD;
        }

        return (int) ans;
    }
}
