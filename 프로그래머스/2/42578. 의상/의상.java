import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        Map<String,Integer>map=new HashMap<>();
        
        for(int i=0;i<clothes.length;i++){
            String[] starr=clothes[i];
            String kind=starr[1];
            map.put(kind,map.getOrDefault(kind,0)+1);
        }
        int sum=1;
      for (Map.Entry<String, Integer> entry : map.entrySet()) {
            int a=entry.getValue();
            sum*=(a+1);
      }
        
        
        
        int answer = sum-1;
        
        return answer;
    }
    
}
