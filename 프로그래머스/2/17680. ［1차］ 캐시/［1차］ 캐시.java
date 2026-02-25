import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {

        if (cacheSize == 0) return cities.length * 5;

        int answer = 0;

        Map<String, Boolean> map = new HashMap<>();
        Deque<String> deque = new LinkedList<>();

        for (String city : cities) {

            city = city.toLowerCase();

            // 🔹 Cache Hit
            if (map.containsKey(city)) {
                answer += 1;

                // 기존 위치 제거 후 맨 뒤로 이동
                deque.remove(city);
                deque.offerLast(city);
            }
            // 🔹 Cache Miss
            else {
                answer += 5;

                if (deque.size() >= cacheSize) {
                    String oldest = deque.pollFirst(); // 가장 오래된 것 제거
                    map.remove(oldest);
                }

                deque.offerLast(city);
                map.put(city, true);
            }
        }

        return answer;
    }
}