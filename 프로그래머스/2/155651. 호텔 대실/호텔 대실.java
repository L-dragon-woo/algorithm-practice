class Solution {
    public int solution(String[][] book_time) {
        int[] time = new int[24 * 60 + 10];

        for (String[] b : book_time) {
            int start = toMin(b[0]);
            int end   = toMin(b[1]) + 10;

            time[start]++;
            time[end]--;
        }

        int answer = 0, cur = 0;
        for (int i = 0; i < time.length; i++) {
            cur += time[i];
            answer = Math.max(answer, cur);
        }
        return answer;
    }

    private int toMin(String s) {
        return Integer.parseInt(s.substring(0,2)) * 60
             + Integer.parseInt(s.substring(3,5));
    }
}
