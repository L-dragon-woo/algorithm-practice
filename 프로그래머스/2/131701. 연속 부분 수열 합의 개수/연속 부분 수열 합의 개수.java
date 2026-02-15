import java.util.*;

class Solution {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();
        int n = elements.length;
        
        for (int len = 1; len <= n; len++) {      // 부분수열 길이
            for (int i = 0; i < n; i++) {         // 시작점
                int sum = 0;
                for (int j = 0; j < len; j++) {
                    sum += elements[(i + j) % n]; // 원형 처리
                }
                set.add(sum);
            }
        }
        
        return set.size();
    }
}
