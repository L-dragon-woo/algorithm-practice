import java.util.*;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n = s.length();
        if (n != t.length()) return false;

        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < n; i++) {
            char chs = s.charAt(i);
            char cht = t.charAt(i);

            // s → t 확인
            if (map1.containsKey(chs)) {
                if (map1.get(chs) != cht) return false;
            } else {
                map1.put(chs, cht);
            }

            // t → s 확인
            if (map2.containsKey(cht)) {
                if (map2.get(cht) != chs) return false;
            } else {
                map2.put(cht, chs);
            }
        }
        return true;
    }
}