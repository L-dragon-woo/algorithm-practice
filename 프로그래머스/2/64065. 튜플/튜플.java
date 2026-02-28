import java.util.*;

class Solution {
    public int[] solution(String s) {
        
        s = s.substring(2, s.length()-2);
        String[] arr = s.split("\\},\\{");
        
        Arrays.sort(arr, (a, b) -> a.length() - b.length());
        
        Set<Integer> set = new LinkedHashSet<>();
        
        for (String str : arr) {
            String[] nums = str.split(",");
            for (String num : nums) {
                set.add(Integer.parseInt(num));
            }
        }
        
        return set.stream()
                  .mapToInt(Integer::intValue)
                  .toArray();
    }
}