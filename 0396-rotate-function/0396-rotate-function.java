class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        if (n == 1) return 0;

        int sum = 0;
        int value = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
            value += i * nums[i];
        }

        int max = value;

        for (int i = 0; i < n - 1; i++) {
            value = value - sum + nums[i] * n;
            max = Math.max(max, value);
        }

        return max;
    }
}