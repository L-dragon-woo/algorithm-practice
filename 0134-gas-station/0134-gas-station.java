class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0;
        int curr = 0;
        int start = 0;

        for (int i = 0; i < gas.length; i++) {
            int diff = gas[i] - cost[i];
            total += diff;
            curr += diff;

            // 현재 경로가 실패 → 시작점 변경
            if (curr < 0) {
                start = i + 1;
                curr = 0;
            }
        }

        return total >= 0 ? start : -1;
    }
}