import java.util.*;

class Solution {
    public int solution(String str1, String str2) {

        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();

        Map<String, Integer> map1 = makeMap(str1);
        Map<String, Integer> map2 = makeMap(str2);

        if(map1.size() == 0 && map2.size() == 0)
            return 65536;

        int intersection = 0;
        int union = 0;

        Set<String> keys = new HashSet<>();
        keys.addAll(map1.keySet());
        keys.addAll(map2.keySet());

        for(String key : keys){
            int v1 = map1.getOrDefault(key, 0);
            int v2 = map2.getOrDefault(key, 0);

            intersection += Math.min(v1, v2);
            union += Math.max(v1, v2);
        }

        return (int)((double)intersection / union * 65536);
    }

    private Map<String, Integer> makeMap(String str){
        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < str.length() - 1; i++){
            char a = str.charAt(i);
            char b = str.charAt(i + 1);

            if(Character.isLetter(a) && Character.isLetter(b)){
                String s = str.substring(i, i + 2);
                map.put(s, map.getOrDefault(s, 0) + 1);
            }
        }
        return map;
    }
}