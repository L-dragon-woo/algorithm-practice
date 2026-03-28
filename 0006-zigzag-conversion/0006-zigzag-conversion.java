import java.util.*;

class Solution {
    public String convert(String s, int numRows) {
        // 예외 처리
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        // 각 row를 저장할 StringBuilder 배열
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int idx = 0;
        boolean down = true;

        for (char c : s.toCharArray()) {
            rows[idx].append(c);

            if (idx == 0) {
                down = true;
            } else if (idx == numRows - 1) {
                down = false;
            }

            idx += down ? 1 : -1;
        }

        // 결과 합치기
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}